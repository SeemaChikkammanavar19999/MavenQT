package Verification_Login;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import Resources.Base;

public class Color_Verify extends Base{

	@Test
	
	public void color() throws IOException{
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		Set<String> col=new HashSet<String>();
		col.add("#fdcc160");
		col.add("#2a2559");
		col.add("#ffffff");
		
		Loginpage l1=new Loginpage(driver);
		String gold=Color.fromString(l1.headscolor().getCssValue("background-color")).asHex();
		String white=Color.fromString(l1.Bcolor().getCssValue("background-color")).asHex();
		String navy=Color.fromString(l1.butoncolor().getCssValue("background-color")).asHex();
		
		if(col.contains(gold)) {
			System.out.println("golden color verified");
		}
		
		else
		{
			System.out.println("take ss");
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Camera Roll\\ss.png"));
		}
		if(col.contains(white)) {
			System.out.println("white color verified");
		}
		
		else
		{
			System.out.println("take ss");
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Camera Roll\\ss1.png"));
		}
		if(col.contains(navy)) {
			System.out.println("navy color verified");
		}
		
		else
		{
			System.out.println("take ss");
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Camera Roll\\ss2.png"));
		}
		
		driver.close();
	}
	
}
