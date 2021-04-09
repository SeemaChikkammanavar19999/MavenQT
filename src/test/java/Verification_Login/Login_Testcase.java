package Verification_Login;



import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PageObject.Loginpage;
import Resources.Base;
import junit.framework.Assert;

public class Login_Testcase extends Base {

	@Test(dataProvider="getData")
	public void basepagenavigation(String username,String password) throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("successfully opened application");
		
		Loginpage l=new Loginpage(driver); 
		
	
		l.Username().sendKeys(username);
		l.password().sendKeys(password);
		l.login().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://qtrecognition.testqtwiz.com/Activity.php");
		log1.info("successfully entered username and pword");
		driver.close();
		driver.quit();
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[8][2];
		
		data[0][0]="test1";   //invalid username
		data[0][1]="test2";   //invalid password 
		
		data[1][0]="seema.Chikkammanavar@qualitestgroup.com"; //valid username
		data[1][1]="p@ssw0rd";                                //valid password
		
		data[2][0]="seema.Chikkammanavar@qualitestgroup.com"; //valid username
		data[2][1]="";                                        //no password given
	
		data[3][0]="seema.Chikkammanavar@qualitestgroup.com"; //valid username
		data[3][1]="P@SSW0RD";                                  //casesensitive passwword  
	

		data[4][0]="SEEMA.CHIKKAMMANAVAR@QUALITESTGROUP.COM"; //casesensitive username
		data[4][1]="p@ssw0rd";                                 //valid password
	

		data[5][0]="seema.Chikkammanavar@qualitestgroup.com";   //valid username
		data[5][1]="ZZZZZ";                                     //invalid password
		

		data[6][0]="ABC@qualitestgroup.com";                    //invalid username
		data[6][1]="p@ssw0rd";		                            //valid password

		data[7][0]="";                                         //no username
		data[7][1]="p@ssw0rd";                                 //valid password
		
		
		
		
		
		return data;
		
	}
		
	}
