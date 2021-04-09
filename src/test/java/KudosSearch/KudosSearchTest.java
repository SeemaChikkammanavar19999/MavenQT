package KudosSearch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.Activity;

import PageObject.Loginpage;
import Resources.Base;

public class KudosSearchTest extends Base{
	@Test
	public void active1() throws IOException, InterruptedException, AWTException 
    {
        
            driver=initializeDriver();
            driver.get(prop.getProperty("url"));
            log1.info("successfully opened the app");
            
           Loginpage l3=new Loginpage(driver); 
            l3.Username().sendKeys("seema.Chikkammanavar@qualitestgroup.com");
            l3.password().sendKeys("P@ssw0rd");
            l3.login().click();
            Activity k=new Activity(l3.driver);
            k.searchkudo1().click();
            Thread.sleep(1000);
            k.searchkudo2().sendKeys("Aishwarya kurkoti");
            Thread.sleep(1000);
    		Robot T1=new Robot();
    		T1.keyPress(KeyEvent.VK_DOWN);
    		T1.keyPress(KeyEvent.VK_ENTER);
    		Thread.sleep(1000);
           k.searchkudo3().click();
           Thread.sleep(1000);
           driver.close();
    }
	

}
