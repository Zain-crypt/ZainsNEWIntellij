package Review_Materials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Review_1262023_GetText {
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
        driver.navigate().to("https://www.anthem.com");

        //Requirement 1
        //wait 2 seconds
        Thread.sleep(2000);
        String Familyplan = driver.findElement(By.xpath("//*[@class='richTextEditor secondary']")).getText();
        System.out.println("Individual and Family plan is "+ Familyplan);

        //Requirement 2
        //I would like to validate all the descriptions of all the plans
        //hint: for loop, webElement, arraylist, getText


        List<WebElement> planDescriptionElements = driver.findElements(By.xpath("//*[@class='richTextEditor secondary']"));
        for (int  i=0; i < planDescriptionElements.size(); i++){
            System.out.println("Plan description for plan " +  i + " is " + planDescriptionElements.get(i).getText());



        }//end of loop

        driver.quit();
    }//end of main
}//end of class
