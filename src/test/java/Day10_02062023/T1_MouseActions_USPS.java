package Day10_02062023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseActions_USPS {
    public static void main(String[] args) throws InterruptedException {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://usps.com");

        Thread.sleep(2000);
        //hover over send tab
        //store the send tab element in a WebElement variable
        WebElement sendTab = driver.findElement(By.xpath("//*[@id= 'mail-ship-width']"));
        //declare mouse actions
        Actions mouseActions = new Actions(driver);
        //moved to desired element (sendTab), perform() is needed for more mosue actions
        mouseActions.moveToElement(sendTab).perform();
        //wait 3 sec
        Thread.sleep(3000);
        //click on calculate a price using mouse click
        WebElement calcPrice = driver.findElement(By.xpath("//*[@class= 'tool-calc']"));
        //move to calculate price element and click on it
        mouseActions.moveToElement(calcPrice).click().perform();
        Thread.sleep(2000);
       //store usps into WebElement
        WebElement uspsHome = driver.findElement(By.xpath("//*[@alt= 'USPS.com home']"));
        //right click on usps home logo
        mouseActions.moveToElement(uspsHome).contextClick().perform();
        //wait 3 seconds
        Thread.sleep(3000);
        //double click on uspshome logo
        mouseActions.moveToElement(uspsHome).doubleClick().perform();
        //wait 3 seconds
        Thread.sleep(3000);

        driver.quit();
    }//end of main method
}//end of class
