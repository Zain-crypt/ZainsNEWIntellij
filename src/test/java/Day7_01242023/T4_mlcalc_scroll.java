package Day7_01242023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T4_mlcalc_scroll {
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

        //navigate to yahoo home page
        driver.navigate().to("https://www.mlcalc.com/");

        //define javascript executor (allows us to scroll)
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 points
        jse.executeScript("scroll (0,800)");
        //wait 3 seconds
        Thread.sleep(3000);
        //scroll up 400 pixels
        jse.executeScript(" (0,-400)");
        //wait 3 seconds
        Thread.sleep(3000);
        //scroll to the calculate button
        //we need to store the xpath into a webelement variable
        WebElement calculateButton = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //window will scroll to calculate button
        jse.executeScript("arguments[0].scrollIntoView(true);", calculateButton);
        //wait a bit
        Thread.sleep(5000);
        //quit driver
        driver.quit();

    }//end of main method
}//end of class
