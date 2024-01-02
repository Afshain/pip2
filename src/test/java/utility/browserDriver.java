package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserDriver {
    public WebDriver driver;
      public void Driversetup(){
//          this.driver = driver;
          driver = new ChromeDriver();
//          System.setProperty("web-driver.chrome.driver","D:\\TestPIP2\\src\\test\\resourcesDriversFolder/chromedriver.exe");
//          System.setProperty("webdriver.chrome.driver",System.setProperty("user.dir")+"D:\\TestPIP2\\src\\test\\resourcesDriversFolder/chromedriver.exe");

          driver.get("https://www.saucedemo.com/");
//          this.driver = new ChromeDriver();
//          driver.get("https://www.saucedemo.com/");
      }
//      public void close(){
//          this.driver.close();
}
