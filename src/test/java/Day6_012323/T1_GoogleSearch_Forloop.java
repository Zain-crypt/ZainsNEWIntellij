package Day6_012323;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T1_GoogleSearch_Forloop {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("BMW");// index 0
        carBrands.add("Benz");//index 1
        carBrands.add("Bentley");//index 2
        carBrands.add("Toyota");//index 3
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

       //define your WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();
        //maximize the driver
        driver.manage().window().maximize();


           //start of the for loop
          //we don't want to keep relaunching the browser
          //hence why we are excluding the above lines for the loop
           for (int  i=0; i < carBrands.size(); i++){

               //navigate to google home page
           driver.navigate().to("https://www.google.com");

           //this slows down code by 2 seconds
               Thread.sleep(2000);

               //enter the keyword cars on your search field

               //this is and example of a relative xpath
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(carBrands.get(i));

            //this is and example of an absolute xpath
            //driver.findElement(By.xpath("/html/body/div[5]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/input")).sendKeys("cars");

               //hit submit on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();



            //capture the search results and only print out the search number
            //there are other locators in selenium such as id , name, class, cssselectors, and xpath
            //we mainly choose  xpath to handle dynamic elements
            String results = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            String[] arrayMessage = results.split(" ");
            System.out.println("Search Number is " + results);
            //print out just the number from search results
            System.out.println("Search Result for car brand: " + carBrands.get(i) + " is " + arrayMessage[1]);
        }//end of for loop
        //quit the driver
            driver.quit();
      }//end main method
   }//end of class
