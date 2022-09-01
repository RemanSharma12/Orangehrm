package Orangehrm.Test;

public class loginpage extends baseclass{
    public static void main(String args[]) throws InterruptedException{
        setup();
        pagefactory.getLogin().login();
        pagefactory.getLogin().admin();
    }
}
