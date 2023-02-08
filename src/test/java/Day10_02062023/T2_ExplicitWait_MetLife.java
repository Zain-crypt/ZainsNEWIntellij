package Day10_02062023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class T2_ExplicitWait_MetLife {
    public static void main(String[] args) {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.metlife.com/");
        //declare the explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //click on solutions tab
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(), 'SOLUTIONS')]"))).get(0).click();
        //click on dental link
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() =  'Dental']"))).click();
        //quit the driver
        driver.quit();

    }//end of main method
}//end of class
