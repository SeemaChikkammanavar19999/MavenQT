package Activity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import Resources.Base;
import Sendkudos.Maincondition;

public class ActivityPageTest extends Base {

	public void active() throws IOException 
    {
        
            driver=initializeDriver();
            driver.get(prop.getProperty("url"));
            log1.info("successfully opened the app");
            
           Loginpage l3=new Loginpage(driver); 
            l3.Username().sendKeys("seema.Chikkammanavar@qualitestgroup.com");
            l3.password().sendKeys("P@ssw0rd");
            l3.login().click();
           
    }
   
	@Test
    public void NameInLeftSide() throws IOException
    {
        active();
        WebElement ele=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div/div[1]/div/h5"));
        Point loc=ele.getLocation();
        int x=loc.getX();
        System.out.println("position from left side is:"+x);
        int y=loc.getY();
        System.out.println("position from left side is:"+y);

 

        if(x<=450 && y<=200)
        {
            System.out.println("Name is in lefthand side of the screen");
        }
        else {
            System.out.println("Name is not in lefthand side of the screen");
        }
        driver.close();
    }
	
	
}
