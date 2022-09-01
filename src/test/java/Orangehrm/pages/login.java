package Orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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
        driver.findElement(By.partialLinkText("Admin")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
       driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
       driver.findElement(By.xpath("//div[contains(text(),'Admin')]"));
//        Select objSelect =new Select(driver.findElement(By.id("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")));
//        objSelect.selectByVisibleText("Admin");
    }

}
