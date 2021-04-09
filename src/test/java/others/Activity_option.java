package others;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import Resources.Base;

public class Activity_option extends Base{
	public void active2() throws IOException, InterruptedException, AWTException 
    {
        
            driver=initializeDriver();
            driver.get(prop.getProperty("url"));
           
           Loginpage l4=new Loginpage(driver); 
            l4.Username().sendKeys("seema.Chikkammanavar@qualitestgroup.com");
            l4.password().sendKeys("P@ssw0rd");
            l4.login().click();
            
}
	@Test
    
    public void activity() throws IOException, InterruptedException, AWTException
    {
    
    active2();
    WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Activity')]"));
    ele.click();
    Thread.sleep(3000);
   driver.close();
}
}
