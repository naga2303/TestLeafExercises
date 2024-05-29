package week1.SeleniumExercises;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass
{
    public static  void main(String args[]){
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");

    }
}
