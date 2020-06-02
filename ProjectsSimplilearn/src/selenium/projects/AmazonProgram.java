package selenium.projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProgram {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation Engineer\\\\Automation\\\\BrowserDrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//go to amazon.ca, and search for laptop.
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.xpath("//*[@class='nav-input']")).click();
		
		//select RAM (6G & more), operating system (system), CPU core (quad core), and display size (14 inches).
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"p_n_feature_five_browse-bin/7326866011\"]/span/a/div/label/i"));
		option1.click();
		driver.findElement(By.xpath("//*[@id=\"p_n_operating_system_browse-bin/14083352011\"]/span/a/span")).click();
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"p_n_feature_fourteen_browse-bin/7322419011\"]/span/a/div/label/i"));
		option2.click();
		WebElement option3 = driver.findElement(By.cssSelector("#p_n_size_browse-bin\\/7326920011 > span > a > div > label > i"));
		option3.click();
		
		//page object model
		
		
	}

}
