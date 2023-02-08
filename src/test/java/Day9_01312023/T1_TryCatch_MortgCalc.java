package Day9_01312023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_TryCatch_MortgCalc {
    public static void main(String[] args) throws InterruptedException {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //declare chrome options
        //Note that chrome options need to be defined before the WebDriver
        ChromeOptions options = new ChromeOptions();

        //start driver maximized
        options.addArguments("start-maximized");

        //define your WebDriver for chrome driver and pass down options in chrome driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator home page
        driver.navigate().to("https://www.mortgagecalculator.org/");

        //wait a bit
        Thread.sleep(2000);

        //start of the home value try-catch block
        try{
            //store homevalue in WebElement
            WebElement homevalue =  driver.findElement(By.xpath("//*[@id= 'homeval']"));
            //clear the default homevalue
            homevalue.clear();
            //enter a new homevalue
            homevalue.sendKeys("79000");
        }catch (Exception err) {
            System.out.println("Unable to enter home value for reason: " + err);
        }//end of try-catch block for home value

        //Start of downpayment try-catch block
        try{
            //store downpayment in webElement
            WebElement downPayment = driver.findElement(By.xpath("//*[@id = 'downpayment']"));
            //clear the default downpayment
            downPayment.clear();
            //enter a new home value
            downPayment.sendKeys("80000");
        } catch (Exception err) {
            System.out.println("Unable to enter down payment for reason: " + err);
        }//end of downpayment try-catch block

        //start of startMonth try-catch block
        try {
            //store startmonth in a webElement
            WebElement startMonth = driver.findElement(By.xpath("//*[@name = 'param[start_month]']"));
            Select startMonthDropDown = new Select(startMonth);
            startMonthDropDown.selectByVisibleText("June");
        } catch (Exception err) {
            System.out.println("Unable to select start month dropdown for reason: " + err);
        }//end of startmonth try-catch block

        //start of click on calculate button try-catch block
        try {
            //click on the calculate button
            driver.findElement(By.xpath("//*[@value = 'Calculate']")).click();
        } catch (Exception err) {
            System.out.println("Unable to click on calculate button for reason: " + err);
        }//end of click on calculate button try-catch block

        //start of capture monthly payment try-catch block
        try {
            //capture the monthly payment
            String monthlyPayment = driver.findElements(By.xpath("//*[@class= 'left-cell']/h3")).get(0).getText();
            System.out.println("The monthly payment is: " + monthlyPayment);
        } catch (Exception err) {
            System.out.println("Unable to capture monthly payment for reason: " + err);
        }//end of click on calculate button try-catch block

        //quit the driver
        driver.quit();


    }//end of main method
}//end of class
