package seleniumMarathonExercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PvrCinemasCase {

    public static void main(String args[]){
        try{
            
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.pvrcinemas.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search for city']")).sendKeys("Chennai");
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        driver.findElement(By.xpath("//span[text()='Cinema']")).click();
        driver.findElement(By.id("cinema")).click();
        driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[1]/span")).click();
        //select date
       
        Thread.sleep(5000);
         driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]/span")).click();
                //select movie
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]/span")).click();
        //select timings
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]/span")).click();
        //click Book
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Book']")).click();
        //Accept terms and condition
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
                //click Seat
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[1]")).click(); 
        Thread.sleep(2000);
        String bookingDetails = driver.findElement(By.xpath("//div[@class='all-summary ']")).getText();
        System.out.println(bookingDetails);
        String grandPrice = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
        System.out.println("GrandTotal: "+grandPrice);
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
            Thread.sleep(2000);
        //Verifying GrandPrice
        String GrandTotal=driver.findElement(By.xpath("//div[@class='all-grand']/div/h6[2]")).getText();
        if(GrandTotal.equals(grandPrice)){
            System.out.println("Both Prices are equal");
        }
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[contains(@class,'pi-times')])[2]")).click();
        Thread.sleep(3000);
        String Title = driver.getTitle();
        System.out.println("Title of the page: "+Title);

        
        

    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    }
}
//H441865187