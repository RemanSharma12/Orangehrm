package Orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    WebDriver driver;

    By username = By.name("username");
    By password = By.name("password");
    By submit = By.xpath("//button");


    public login(WebDriver driver) {
        this.driver = driver;
    }

    public void login() throws InterruptedException{
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();
    }
    public  void admin(){
        driver.findElement(By.xpath("//span[contains(text(),'Admin')]"));
    }

}
