package Day8_1302023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Select_Command {
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

        //navigate to mlcalc home page
        driver.navigate().to("https://www.mlcalc.com/");

        //wait a bit
        Thread.sleep(2000);

        //click on show advanced options
        driver.findElement(By.xpath("//*[text() = 'Show advanced options']")).click();

        //wait a bit
        Thread.sleep(2000);

        //store the month dropdown into a webElement variable  first
        WebElement startMonthElement = driver.findElement(By.xpath("//*[@id = 'fpdd']"));

        //define the select month statement
        Select startMonthDropdown = new Select(startMonthElement);
        //use select by visible text to select May

        startMonthDropdown.selectByIndex(4);
        //wait a bit

        Thread.sleep(1000);
        //use select command to select a year

        WebElement startYearElement = driver.findElement(By.xpath("//*[@name = 'sy']"));
        //wait a bit

        Thread.sleep(2000);
        //define select statement for year dropdown

        Select startYearDropdown = new Select(startYearElement);
        //select year 2025 by visible text

        startYearDropdown.selectByVisibleText("2025");
        //wait a bit
        Thread.sleep(2000);

        //alternative approach to select using xpath without the select statement
        driver.findElement(By.xpath("//*[@name = 'sy']")).click();
        driver.findElement(By.xpath("//*[text() = '2025']")).click();

        //wait a bit
        Thread.sleep(2000);

        //quit the driver
        driver.quit();

    }//end of main method
}//end of class
