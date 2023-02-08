package Review_Materials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) throws InterruptedException {
        //set up our chrome driver manager
        WebDriverManager.chromedriver().setup();

//define your WebDriver for chrome driver
        WebDriver driver = new ChromeDriver();

//navigate to google home page
        driver.navigate().to("https://www.google.com");

//enter the keyword cars on your search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("bmw");

//hit submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

//capture the search results and only print out the search number
        String results = driver.findElement(By.xpath("//*[@class='CgQ5 vCa9Yd QfkTvb N8QANc MUxGbd v0nnCb']")).getText();
        String[] arrayMessage = results.split(" ");
        System.out.println("Search Number is " + arrayMessage[1]);


//quit the driver
        driver.quit();





    }//end of main

}//end of class




