package Day9_01312023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static java.lang.Thread.*;

public class T2_Hotels_InClassAI {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> hotelDestinationsUS = new ArrayList<>();

        hotelDestinationsUS.add("Virginia");//index 0
        hotelDestinationsUS.add("New York");//index 1
        hotelDestinationsUS.add("Maine");//index 2

        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

        //declare chrome options
        //Note that chrome options need to be defined before the WebDriver
        ChromeOptions options = new ChromeOptions();

        //start driver maximized
        options.addArguments("start-maximized");

        //define your WebDriver for chrome driver and pass down options in chrome driver
        WebDriver driver = new ChromeDriver(options);



        for (int i = 0; i < hotelDestinationsUS.size(); i++) {

            //navigate to mortgage calculator home page
            driver.navigate().to("https://www.Hotels.com");
            //wait a bit
            Thread.sleep(1000);

            try {
                //click on going to search box
                driver.findElement(By.xpath("//*[@class= 'uitk-fake-input uitk-form-field-trigger']")).click();
                //search in going to field
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(hotelDestinationsUS.get(i));
            } catch (Exception err) {
                System.out.println("Unable to search hotel destinations: " + err);
            }//end of click on calculate button try-catch block

               //click on first drop down
            try {
                driver.findElements(By.xpath("//*[@class='truncate']")).get(0).click();
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to click on first dropdown for reason: " + err);
            }//end of clicking first dropdown
                 //click search button

            try {
                driver.findElement(By.xpath("//*[@id='search_button']")).click();
               Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to click on search button for reason: " + err);
            }//end of clicking search button

            //create a arraylist for hotel suggestions
            ArrayList <WebElement> hotelList = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid='open-hotel-information']")));



            //start of conditions
            if (i == 0) {
               hotelList.get(0).click();
            } else if (i == 1) {
               hotelList.get(2).click();
            } else if (i == 2) {
               hotelList.get(1).click();
            }//end of conditions

            //switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(3000);



            //start of capturing the resort name
            try {
                String resortName = driver.findElement(By.xpath("//*[@class= 'uitk-heading uitk-heading-3']")).getText();
                System.out.println("The name of the resort is " + resortName);
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to capture resort name for reason: " + err);
            }//end of capturing the resort name

            //start of clicking on reserve button
            try {
                driver.findElement(By.xpath("//*[@//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']]")).click();
                Thread.sleep(3000);
            } catch (Exception err) {
                System.out.println("Unable to click on reserve button for reason: " + err);
            }//end of clicking on reserve button

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll (0,1200)");
            //start of capturing first price per night
            try {
                String firstPrice = driver.findElements(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).get(0).getText();
                System.out.println("The first price per night is: " + firstPrice);
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to capture first price per night for reason: " + err);
            }//end of capturing first price per night



            //start of capturing all hotel room info
            try {
                String hotelRoomInfo = driver.findElement(By.xpath("//*[@class='c-hds-success-1']")).getText();
                System.out.println("All hotel room info is " + hotelRoomInfo);
                Thread.sleep(3000);
            } catch (Exception err) {
                System.out.println("Unable to capture all hotel room info for reason: " + err);
            }//end of getting hotel room info
            driver.close();
            //switch to first tab
            driver.switchTo().window(tabs.get(0));

        }//end for loop

        driver.quit();
    }//end of main
}//end of class
