package Test;

import pages.pagefactory;

public class baseclass {
    static WebDriver driver;
    protected static pagefactory pagefactory;

    public static void setup(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","Chromrdriver.exe");
        driver.get(". https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pagefactory = new pagefactory();
    }
}
