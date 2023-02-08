package Automation_AI04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem4 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> Hobby = new ArrayList<>();
        //add values for countries
        Hobby.add("Skydiving"); //index 0
        Hobby.add("Skating"); //index 1
        Hobby.add("Snowboarding"); //index 2
        Hobby.add("Traveling"); //index 3

        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //declare chrome options
        //Note that chrome options need to be defined before the WebDriver
        ChromeOptions options = new ChromeOptions();

        //open window maximized and incognito mode
        options.addArguments("start-maximized", "incognito");


        //define your WebDriver for chrome driver and pass down options in chrome driver
        WebDriver driver = new ChromeDriver(options);

        //use for loop
        for (int  i=0; i < Hobby.size(); i++) {

            //navigate to yahoo home page
            driver.navigate().to("https://www.yahoo.com");

            //Wait 2 second
            Thread.sleep(2000);


            //enter the hobbies in the search field
            driver.findElement(By.xpath("//*[contains(@id,'ybar-sbq')]")).sendKeys(Hobby.get(i));


            //Wait 2 seconds
            Thread.sleep(2000);

            //click on search button
            driver.findElement(By.xpath("//*[contains(@type,'submit')]")).submit();


            //Capture results by using string and xpath get text
            String results = driver.findElement(By.xpath("//*[contains(@class, 'title mb-0')]")).getText();

           //Split the results
            String[] SearchResultVariable = results.split(" ");
            System.out.println("Search Number is " + results);
            //print out just the number from search results
            System.out.println("Search Result for Hobbies: " + Hobby.get(i) + " is " + SearchResultVariable[1]);

            //define javascript executor (allows us to scroll)
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll down 1500 points
            jse.executeScript("scroll (0,1500)");
            //wait 3 seconds
            Thread.sleep(2000);

            //Click on about this page
            driver.findElement(By.xpath("//*[text()='About this page']")).click();

            //capture message for Yahoo questions get 24 hour live support
            String message = driver.findElement(By.xpath("//*[contains(@id, 'announce')]")).getText();
            System.out.println(message);
        }//end of for loop

        //quit driver
        driver.quit();
    }//end of main method
}//end of class
