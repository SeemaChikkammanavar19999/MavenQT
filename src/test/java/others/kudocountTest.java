package others;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import PageObject.Activity;
import Resources.Base;
import Sendkudos.Maincondition;

public class kudocountTest extends Base {
	
	public void basepagenavigation() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("successfully opened application");
		
		Loginpage l=new Loginpage(driver); 
		
	
		l.Username().sendKeys("seema.Chikkammanavar@qualitestgroup.com");
		l.password().sendKeys("p@ssw0rd");
		l.login().click();
		log1.info("successfully entered username and pword");
		
		
	}
	public int sendkudos() throws IOException {
      
		basepagenavigation();
        Activity ok=new Activity (driver);
        int val=Integer.parseInt(ok.kudocount().getText().split(" ")[0]);
      
        return val;
    }
public void sendkudo1() throws InterruptedException {
		
		
	Activity a=new Activity(driver);
	  a.Sendkudoss().click();
	  
		a.NameEmail().sendKeys("Aishwarya Kurkoti (aishwarya.kurkoti@qualitestgroup.com)");
		a.kudotype1().click();
	a.kudostype("Exceptional Work");
		a.comments().sendKeys("AWESOME");
		
		a.send().click();
		
		
	}
        public int  cnt() throws InterruptedException {
            Activity ok=new Activity(driver);
            int vals=Integer.parseInt(ok.kudocount().getText().split(" ")[0]);
        return vals;
        }
   
        @Test
        public void testcase() throws IOException, InterruptedException {
            int aft=sendkudos();
            sendkudo1();
            Thread.sleep(1000);
            int cmt=cnt();
            if(aft>cmt)
            {
                System.out.println("Hi");
            }
            else {
                System.out.println("count increased");
            }
            driver.close();
        }
}

	