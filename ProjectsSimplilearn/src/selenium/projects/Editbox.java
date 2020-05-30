package selenium.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Engineer\\Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oxfordlearnersdictionaries.com/");

	}

}
