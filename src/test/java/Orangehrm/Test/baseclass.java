package Orangehrm.Test;

import Orangehrm.pages.pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseclass {
    static WebDriver driver;
    protected static pagefactory pagefactory;

    public static void setup(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","Chromrdriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pagefactory = new pagefactory(driver);
    }
}
