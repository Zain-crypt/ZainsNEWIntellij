package Day7_01242023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.*;

public class T1_Xpath_Text_Contains {
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
        Thread.sleep(2000);
        //click to sign in
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();

        Thread.sleep(2000);

        //go back to yahoo.com
        driver.navigate().back();
        //wait 1 sec
       Thread.sleep(5000);

        //click on bell icon(notification)
        driver.findElement(By.xpath("//*[contains(@class,'rapid-nonanchor-lt ybar-icon-sprite _yb_z2skm _yb_j6z1u')]")).click();

        //wait 2 seconds

        Thread.sleep(2000);

        //quit driver
        driver.quit();




    }//end of main method
}//end of class
