package pageobjecct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearch {
	
	WebDriver driver;

public AmazonSearch (WebDriver driver) {
	
	this.driver = driver;
    }
	By SearchBox = By.id("twotabsearchtextbox");
    By submit = By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input");
	By ram = By.xpath("//*[@id=\"p_n_feature_five_browse-bin/7326866011\"]/span/a/div/label/i");
	By OS = By.id("p_n_operating_system_browse-bin/14083352011");
	By cpu = By.xpath("//*[@id=\\\"p_n_feature_fourteen_browse-bin/7322419011\\\"]/span/a/div/label/i");
	By display = By.cssSelector("#p_n_size_browse-bin\\\\/7326920011 > span > a > div > label > i");


    public WebElement SearchLaptop () {
    	return driver.findElement(SearchBox);
    }
    
    public WebElement Search () {
    	return driver.findElement(submit);  	
    }
    
    public WebElement ChooseRam () {
    	return driver.findElement(ram);
    }
    
    public WebElement ChooseOS () {
    	return driver.findElement(OS);
    }
    
    public WebElement ChooseCPU () {
    	return driver.findElement(cpu);
    }
    
    public WebElement ChooseScreen () {
    	return driver.findElement(display);
    }
    
    }
