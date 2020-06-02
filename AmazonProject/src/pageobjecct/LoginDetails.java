package pageobjecct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDetails {
	
	WebDriver driver;

	public LoginDetails (WebDriver driver) {
		
		this.driver = driver;

	}
	
	By signin = By.id("nav-link-accountList");
	By username = By.name("email");
	By click1 = By.id("continue");
	By pw = By.name("password");
	By click2 = By.xpath("//*[@id=\"signInSubmit\"]");
	By accountlist = By.id("nav-link-accountList");
	By add = By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[1]/img");

public WebElement AccountSignin () {
	return driver.findElement(signin);
}

public WebElement Email () {
	return driver.findElement(username);  	
}

public WebElement Continue1 () {
	return driver.findElement(click1);
}

public WebElement Password () {
	return driver.findElement(pw);
}

public WebElement Continue2 () {
	return driver.findElement(click2);
}

public WebElement AccountInfo () {
	return driver.findElement(accountlist);
}

public WebElement Address () {
	return driver.findElement(add);

}
}