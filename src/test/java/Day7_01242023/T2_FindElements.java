package Day7_01242023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_FindElements {
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
        driver.navigate().to("https://www.yahoo.com");

        //Wait 1 second
      //  Thread.sleep(1000);

        //click on the entertainment button
        driver.findElements(By.xpath("//*[contains(text(), 'tainment')]")).get(2).click();

        //wait 2 seconds
      //  Thread.sleep(2000);

        driver.quit();
    }//end main
}//end of class
