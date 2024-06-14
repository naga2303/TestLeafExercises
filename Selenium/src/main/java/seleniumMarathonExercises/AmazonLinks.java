package seleniumMarathonExercises;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
    public static void main(String[] args) {
        try{
            
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
        driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> ele= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        String[] ar;
            List <Integer> lt = new ArrayList<>();
        for(WebElement e:ele){
           System.out.println("In Rs.format: "+e.getText());
            lt.add(Integer.parseInt(e.getText().replace(",", "")));
        }
        Collections.sort(lt);
        System.out.println("After Sorting: "+lt);
        Thread.sleep(5000);
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
}
