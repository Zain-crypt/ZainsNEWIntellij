package Day5_011723;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class T2_Google_Search {

    public static void main(String[] args) {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

      //define your WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();

       //navigate to google home page
        driver.navigate().to("https://www.google.com");

       //enter the keyword cars on your search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        //hit submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

       //capture the search results and only print out the search number
       //there are other locators in selenium such as id , name, class, cssselectors, and xpath
        String results = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        String[] arrayMessage = results.split(" ");
        System.out.println("Search Number is " + arrayMessage[1]);


//quit the driver
        driver.quit();

    }//end of main method
}//end of class
