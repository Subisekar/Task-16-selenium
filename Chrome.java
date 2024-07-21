import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
public static void main(String[] args) throws InterruptedException {
		
	String expectedTitle = "STORE";
       ChromeDriver driver= new ChromeDriver();
       
      driver.get("https://www.demoblaze.com/");
      driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Page landed on correct website");
		}else
		{
			System.out.println("Page not landed on correct website");
		}
		
		Thread.sleep(3000);
		
		driver.close();

      
       
       
       }

}
