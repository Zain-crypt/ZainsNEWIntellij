package Automation_AI05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class ActionItem05 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> zipCode = new ArrayList<>();

        zipCode.add("11235");//index 0
        zipCode.add("11106");//index 1
        zipCode.add("11224");//index 2

        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //declare chrome options
        //Note that chrome options need to be defined before the WebDriver
        ChromeOptions options = new ChromeOptions();

        //start driver maximized
        options.addArguments("start-maximized", "incognito");

        //define your WebDriver for chrome driver and pass down options in chrome driver
        WebDriver driver = new ChromeDriver(options);

        //start for loop
        for (int i = 0; i < zipCode.size(); i++) {

            //navigate to Weight watchers
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

            Thread.sleep(2000);

            //click on find a workshop
            driver.findElements(By.xpath("//*[@class= 'menuItemInnerWrapper-EkUaW menuItemInnerWrapperWithIcon-3ht2E']")).get(0).click();

            //Click on in person
            driver.findElements(By.xpath("//*[@class= 'toggleButton-2ikVW']")).get(0).click();

            Thread.sleep(3000);

            //start of the search zipCode try-catch block
            try{
                //store in WebElement
                WebElement locator = driver.findElement(By.xpath("//*[@class='input input-3TfT5']"));
                //clear the search
                locator.clear();
                //enter a new
                locator.sendKeys(zipCode.get(i));
            }catch (Exception err) {
                System.out.println("Unable to search zipCode for reason: " + err);
            }//end of try-catch block for zipcode search

            Thread.sleep(3000);

            //Click search button
            driver.findElement(By.xpath("//*[@type='submit']")).click();


            Thread.sleep(2000);
                 //create a arraylist for Studio links
                 ArrayList <WebElement> Studio = new ArrayList<>(driver.findElements(By.xpath("//*[@class= 'wrapperLink-2NobU']")));


                 //start of conditions
                 if (i == 0) {
                     Studio.get(1).click();
                 } else if (i == 1) {
                     Studio.get(2).click();
                 } else if (i == 2) {
                     Studio.get(0).click();
                 }//end of conditions


            Thread.sleep(3000);
            //Studio link address
            try {
                String Studioaddress = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("The address of the studio is " + Studioaddress);
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to capture studio address for reason: " + err);
            }//end of capturing address

            //try catch for scrolling
            try{
            //enable scrolling
            JavascriptExecutor jse = (JavascriptExecutor) driver;

            //we need to store the xpath into a webElement variable
            WebElement Workshop = driver.findElement(By.xpath("//*[@class= 'title-bEfSM']"));

            //window will scroll to the workshop schedule
            jse.executeScript("arguments[0].scrollIntoView(true);", Workshop);
            } catch (Exception err) {
                System.out.println("Unable to scroll for reason: " + err);
            }//end of try catch for scrolling into view

            //Print out schedule table for upcoming schedule
            String Table = driver.findElement(By.xpath("//*[@class= 'scheduleContainerMobile-1RfmF']")).getText();
            System.out.println("Schedule " + Table);


        }//end of loop

        driver.quit();
    }//end of main
}//end of class
