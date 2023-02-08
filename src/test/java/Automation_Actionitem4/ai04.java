package Automation_Actionitem4;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
public class ai04 {

 public static void main(String[] args) throws InterruptedException {
      ArrayList<String> Sports = new ArrayList<>();
      Sports.add("Cricket");// index 0
      Sports.add("Hockey");//index 1
      Sports.add("Tennis");//index 2
     Sports.add("Baseball");//index 3
     //set up our chrome driver manager
     WebDriverManager.chromedriver().setup();

     //define your WebDriver for chrome driver
     WebDriver driver = new ChromeDriver();
     //maximize the driver
     driver.manage().window().maximize();

     //start of the for loop

     for (int  i=0; i < Sports.size(); i++){

                            //navigate to google home page
                            driver.navigate().to("https://www.yahoo.com");

                            //this slows down code by 2 seconds
                            Thread.sleep(2000);


                            //enter the keyword sports on your search field
                            driver.findElement(By.xpath("//*[@name = 'p']")).sendKeys(Sports.get(i));


                            //hit submit on google search button
                            driver.findElement(By.xpath("//*[@id='ybar-search' ]")).submit();



                            //capture the search results and only print out the search number

                            String results = driver.findElement(By.xpath("//*[contains(@class, 'fz-14')]")).getText();
                            String[] arrayMessage = results.split(" ");
                            System.out.println("Search Number is " + results);
                            //print out just the number from search results
                            System.out.println("Search Result for Sports: " + Sports.get(i) + " is " + arrayMessage[1]);

                            //define javascript executor (allows us to scroll)
                            JavascriptExecutor jse = (JavascriptExecutor) driver;
                            //scroll down
                            jse.executeScript("scroll (0,100000)");
                            //wait 3 seconds
                            Thread.sleep(1000);

                            driver.findElement(By.xpath("//*[text()='About this page']")).click();






                        }//end of for loop

                        String Yahoomessage = driver.findElement(By.xpath("//*[contains(@id, 'announce')]")).getText();
                        System.out.println(Yahoomessage);
                         //quit the driver
                        driver.quit();
                    }//end main method
                }//end of class



