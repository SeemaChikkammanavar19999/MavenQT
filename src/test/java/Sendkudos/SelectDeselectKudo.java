package Sendkudos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Activity;
import Resources.Base;

public class SelectDeselectKudo extends Base{

	
	@Test(dataProvider="datagiven")
	public void sendkudo(String username,String password) throws IOException, AWTException, InterruptedException{
		
	//	driver=initializeDriver();
	//	driver.get(prop.getProperty("url"));
		Maincondition m=new Maincondition();
		
		m.precond(username, password);
		
	Activity a=new Activity(m.driver);
	  a.Sendkudoss().click();
	  Thread.sleep(1000);
		a.NameEmail().sendKeys("Aishwarya Kurkoti");
		Thread.sleep(1000);
		Robot T=new Robot();
		T.keyPress(KeyEvent.VK_DOWN);
		T.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//a.kudotype1().click();
		
//		String arr[]= {"Exceptional Work","Excellent Team Work","Innovative Thinker","Good Client Relations","Quality Hero","Quick Learner","Hard Worker","Team player"};
//		for(int i=0;i<arr.length;i++)
//		{
//		 a.kudostype(arr[i]);
//		 Thread.sleep(1000);
//			 
//		}
		
	a.kudostype("Exceptional Work");
		a.comments().sendKeys("AWESOME");
		a.kudostype("Exceptional Work");
		Thread.sleep(1000);
		a.send().click();
	
		m.driver.close();
		
		
	}
	@DataProvider
	public Object[][] datagiven() {
		Object[][] data1=new Object[1][2];
		data1[0][0]="seema.Chikkammanavar@qualitestgroup.com";
		data1[0][1]="p@ssw0rd";
		return data1;
		
	}
	
//	@DataProvider
//	public Object[][] datagiven1() {
//		Object[][] data=new Object[2][2];
//		data1[0][0]="seema.Chikkammanavar@qualitestgroup.com";
//		data1[0][1]="p@ssw0rd";
//		return data1;
//		
//	}
	
}
