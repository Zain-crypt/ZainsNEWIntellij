package Day8_1302023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class T2_SwitchTabs {
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

        //navigate to fedelis  home page
        driver.navigate().to("https://www.fideliscare.org/");

        //wait a bit
        Thread.sleep(2000);

        //click on a shop plan
        driver.findElement(By.xpath("//*[text()= 'Shop For a Plan']")).click();
        //wait 2 seconds
        Thread.sleep(2000);

        //click on medicaid managed care
        driver.findElement(By.xpath("//*[text()= 'Medicaid Managed Care']")).click();
          // wait a bit
        Thread.sleep(2000);

        //click on find a doctor
        driver.findElement(By.xpath("//*[@class= 'btn btn-outline-primary btn-external btn-show link-external']")).click();

        //wait 2 secs
        Thread.sleep(2000);

        //new tab opens after clicking on find a doctor
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //switch to the new tab
        driver.switchTo().window(tabs.get(1));

        //wait 2 secs
        Thread.sleep(2000);

        //Enter a zip code
        driver.findElement(By.xpath("//*[@id = 'searchLocation']")).sendKeys("11230");

        //Wait few seconds
        Thread.sleep(3000);

        //close the new tab (find a doctor tab)
        driver.close();

        //switch back to the parent
        driver.switchTo().window(tabs.get(0));

        //click on the search button on medicaid managed care (parent tab)
        driver.findElement(By.xpath("//*[contains(@class,'tool dropdown search')]")).click();

        //Wait few seconds
        Thread.sleep(3000);

        //quit the driver
        driver.quit();

    }//end of main method
}//end of class
