package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.mysql.jdbc.Statement;

import pageobjecct.AmazonSearch;
import pageobjecct.LoginDetails;

public class AmazonProgram {
	
	@Before
	
	public void CreateDB () throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchElementException, SQLException 
	{
		
		//Prepare connection
		
		String url = "jdbc:mysql://localhost:3306/db_world";
		
		//Load MySQL server JDBC JDBC driver
		String dbClass = "com.mysql.jdbc.Driver";
		Class.forName(dbClass).newInstance();
		
		//Get connection to DB
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		//Create statement
		Statement stmt = (Statement) con.createStatement();
		
		//Method to return the requested info
		ResultSet result = stmt.executeQuery("select * from userinfo");
		
		if (result.getDate("laptop") != null) {
			System.out.println(result);
		}
			
	}

	@Test
	
	public void SearchResult() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation Engineer\\\\Automation\\\\BrowserDrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca/");
		AmazonSearch as = new AmazonSearch(driver);
			
		as.SearchLaptop().sendKeys("laptop");
		as.Search().click();
		as.ChooseRam().click();
		as.ChooseOS().click();
		as.ChooseCPU().click();
		as.ChooseScreen().click();
		
	}
	
	@Test
	
	public void AccountPage () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation Engineer\\\\Automation\\\\BrowserDrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca/");
		LoginDetails ld = new LoginDetails(driver);
		
		ld.AccountSignin().click();
		ld.Email().sendKeys("abdulmuqtedir@hotmail.com");
		ld.Continue1().click();
		ld.Password().sendKeys("Ab87654321");
		ld.Continue2().click();
		ld.AccountInfo().click();
		ld.Address().click();
		
	}

}
