package Automation_AI03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionItem3_BingSearch {

    public static void main(String[] args) {
        //chrome driver manager
        WebDriverManager.chromedriver().setup();
        //WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();
        //Navigate to bing.com
        driver.navigate().to("https://www.bing.com");
        //enter a keyword sports on the search field
        driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys("sports");
        //enter bing search button
        driver.findElement(By.xpath("//*[@type='submit']")).submit();
        //split the text and only print out the search number
        String number = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
        String[] arrayMessage = number.split(" ");
        System.out.println("Search Number is " + arrayMessage[1]);

        //quit the driver
        driver.quit();
    }//end of main method
}//end of class