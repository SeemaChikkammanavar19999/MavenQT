package Verification_Login;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;
import junit.framework.Assert;

public class Display_Test extends Base{

	@Test
	public void display() throws IOException, InterruptedException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(),"QTRecognition");
			
		
		System.out.println("Display Verified");
		driver.close();
		
	}
}
