package Sendkudos;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.Loginpage;
import Resources.Base;

public class Maincondition extends Base{

	@Test
	public void precond(String username,String password) throws IOException {
		 {
			driver=initializeDriver();
			driver.get(prop.getProperty("url"));
			log1.info("successfully opened application");
			
			Loginpage l=new Loginpage(driver); 
			
		
			l.Username().sendKeys(username);
			l.password().sendKeys(password);
			l.login().click();
			
			
		}
	}
	
}
