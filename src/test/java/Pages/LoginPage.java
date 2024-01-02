package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.browserDriver;

import java.sql.Driver;

public class LoginPage extends browserDriver {
   public  String Email_enter_xpath = "//input[@data-test='username']";
    public  String password_enter_xpath = "//input[@id='password']";
    public String login_btn_xpath = "//input[@class='submit-button btn_action']";

    public void enterEmail(){
        driver.findElement(By.xpath(Email_enter_xpath)).sendKeys("standard_user");
    }
    public  void enterpassword(){
        driver.findElement(By.xpath(password_enter_xpath)).sendKeys("secret_sauce");
    }
    public void clickbtn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }



//    fiunct entertText (string value){
//
//        entertext.sendKeys(value)
    }






//    @FindBy(xpath="//input[@data-test='username']")
//    WebElement Email;
//
//    @FindBy(xpath = "//input[@id='password']")
//    WebElement password;
//
//@FindBy(xpath = "//input[@class='submit-button btn_action']")
//    WebElement loginbtn;

//    public void enterEmail(String emailadd)
//    {
//        Email.sendKeys(emailadd);
//
//    }
//    public void enterPassword(String pwd)
//    {
//        password.sendKeys(pwd);
//
//    }
//    public void clickbtnlogin() throws InterruptedException {
//        Thread.sleep(3000);
//        loginbtn.click();
//
//    }
