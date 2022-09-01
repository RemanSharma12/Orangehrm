package pages;

public class login {
    WebDriver driver;

    By username = By.name("username");
    By password = By.name("password");
    By submit = By.xpath("//button");

    public login(WebDriver driver){
        this.driver = driver;
    }
    public void login(){
        driver.manage().window().maximize();
        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();
    }

    }
