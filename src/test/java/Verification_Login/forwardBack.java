package Verification_Login;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import Resources.Base;

public class forwardBack extends Base {

	@Test(dataProvider = "getData")
	public void login(String username,String password) throws IOException, InterruptedException {
	basepagenavigation(username,password);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.close();
	
	}
	public void basepagenavigation(String username,String password) throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("successfully opened application");
		
		Loginpage l=new Loginpage(driver); 
	
		l.Username().sendKeys(username);
		l.password().sendKeys(password);
		l.login().click();
		log1.info("successfully entered username and pword");
	
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[1][2];
		data[0][0]="seema.Chikkammanavar@qualitestgroup.com";
		data[0][1]="p@ssw0rd";
		return data;
		
	}
		
	}


