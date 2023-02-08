package Review_Materials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.*;

public class Review_01262023 {
    public static void main(String[] args) throws InterruptedException {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //declare chrome options
        //Note that chrome options need to be defined before the WebDriver
        ChromeOptions options = new ChromeOptions();

        //start driver maximized
        options.addArguments("start-maximized", "incognito");

        //define your WebDriver for chrome driver and pass down options in chrome driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo home page
        driver.navigate().to("https://www.yahoo.com");

        //wait 2 seconds
        Thread.sleep(2000);

        //click shopping
        driver.findElements(By.xpath("//*[@class = '_yb_1eq5n   rapid-noclick-resp']")).get(6).click();

        driver.quit();


        //Wait 1 second
    }//end of main
}//end of class
