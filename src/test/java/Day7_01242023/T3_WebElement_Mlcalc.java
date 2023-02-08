package Day7_01242023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_WebElement_Mlcalc {
    public static void main(String[] args) {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //declare chrome options
        //Note that chrome options need to be defined before the WebDriver
        ChromeOptions options = new ChromeOptions();

        //start driver maximized
        options.addArguments("start-maximized");

        //define your WebDriver for chrome driver and pass down options in chrome driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo home page
        driver.navigate().to("https://www.mlcalc.com/");

        //we want to clear the default purchase price field first
      //  driver.findElement(By.xpath("//*[@id = 'ma']")).clear();
        //enter a new purchase price
       // driver.findElement(By.xpath("//*[@id = 'ma']")).sendKeys("675000");

        //clear and type in new purchase price using webElement approach
        WebElement purchasePrice = driver.findElement(By.xpath("//*[@id = 'ma']"));
        purchasePrice.clear();
        purchasePrice.sendKeys("700000");

        driver.quit();


    }//end of main method
}//end of class
