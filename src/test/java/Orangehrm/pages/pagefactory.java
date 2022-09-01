package Orangehrm.pages;

import org.openqa.selenium.WebDriver;

public class pagefactory {
    WebDriver driver;
    private login login;
    public pagefactory(WebDriver driver){
        this.driver = driver;
    }
    public login getLogin(){
        if(login==null){
            login=new login(driver);
        }
        return login;
    }


}
