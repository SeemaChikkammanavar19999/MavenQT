package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage{

	public WebDriver driver;
	
	
	By Uname=By.xpath("//input[@name='username']");
	By pword=By.xpath("//input[@name='pass']");
	By submit=By.xpath("//button[@type='submit']");
	By Headercolor=By.xpath("/html[1]/body[1]/div[1]");
	By bodycolor=By.xpath("/html[1]/body[1]/div[2]");
	By button=By.xpath("/html[1]/body[1]/div[2]/form[1]/button[1]");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement Username() {
		return driver.findElement(Uname);
	}
	
	public WebElement password() {
		return driver.findElement(pword);
		}
	public WebElement login() {
		return driver.findElement(submit);
	}
	public WebElement headscolor() {
		return driver.findElement(Headercolor);
	}
	public WebElement Bcolor() {
		return driver.findElement(bodycolor);
	}
	public WebElement butoncolor() {
		return driver.findElement(button);
	}

	
	

}