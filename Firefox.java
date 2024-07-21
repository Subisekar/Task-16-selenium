import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       FirefoxDriver driver= new FirefoxDriver();
       
      driver.get("http://google.com");
      
       String currentUrl = driver.getCurrentUrl();
       System.out.println("Current URL: " + currentUrl);
       driver.navigate().refresh();
       driver.quit();
       }


}
