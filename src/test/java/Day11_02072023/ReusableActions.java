package Day11_02072023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableActions {

    public static WebDriver chromeDriverSetup(){

        //return method to initiate chromedriver for your test
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //runs test without showing browser
        //options.addArguments("headless");
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);

        //at the end return the driver variable so it can be used on your test class
        return driver;

    }//end of chrome setup method

            //click is a void method which will just perform the action
      public static void clickMethod(WebDriver driver, String xpath, String elementName){
        try{
            WebDriverWait wait =  new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        }catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
      }//end of click method


         //click by index is a void method which will just perform the action
    public static void clickByIndexMethod(WebDriver driver, String xpath, int indexNumber, String elementName){
        try{
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).click();
        }catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of click by index method

    //sendkeys is a void method which will just perform the type action
    public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, String elementName){
        try{
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
        }catch (Exception e) {
            System.out.println("Unable to type on element " + elementName + " " + e);
        }
    }//end of sendkeys method
    
    //getText is a return method which will just perform the type action
    public static String captureText(WebDriver driver, String xpath, String elementName){
        String result = null;
        try{
            WebDriverWait wait = new WebDriverWait(driver,10);
            //it's local to that try catch block
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
        }catch (Exception e) {
            System.out.println("Unable to type on element " + elementName + " " + e);
        }
        return result;
    }//end of getText method


}//end of class
