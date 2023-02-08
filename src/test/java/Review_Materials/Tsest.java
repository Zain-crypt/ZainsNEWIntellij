package Review_Materials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsest {
    public static void main(String[] args) {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //define your WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();

        //navigate to google home page
        driver.navigate().to("https://www.apple.com");


        driver.findElement(By.xpath("//*[@class='ac-gn-link ac-gn-link-iphone']")).click();

        String results = driver.findElement(By.xpath("//*[@class='sosumi-link-follows']")).getText();

        String[] arrayMessage = results.split("for");

        System.out.println("The price is " + arrayMessage[0]);



    }//end of main
}//end of class
