package Activity;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;
import junit.framework.Assert;

public class Display_Test extends Base{

	@Test
	public void display() throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle(),"QTRecognition");
			
		
		System.out.println("Display Verified");
		driver.close();
		
	}
}
