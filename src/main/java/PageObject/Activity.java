package PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity  {
	
	public WebDriver driver;
	By count=By.xpath("//*[@id='todayCount']");
	By send=By.xpath("//a[@data-toggle='modal']");
	By id=By.xpath("//input[@placeholder='* Enter Name or Email Address']");
	By k1=By.xpath("//*[@id='trophy_list']/div[1]/div/div/center/p[1]");
	By k2=By.xpath("//*[@id=\'trophy_list\']/div[2]/div/div/center/p[1]");
	By k3=By.xpath("//*[@id='trophy_list']/div[3]/div/div/center/p[1]");
	By k4=By.xpath("//*[@id='trophy_list']/div[4]/div/div/center/p[1]");
	By k5=By.xpath("//*[@id='trophy_list']/div[5]/div/div/center/p[1]");
	By k6=By.xpath("//*[@id='trophy_list']/div[6]/div/div/center/p[1]");
	By k7=By.xpath("//*[@id='trophy_list']/div[7]/div/div/center/p[1]");
	By k8=By.xpath("//*[@id='trophy_list']/div[8]/div/div/center/p[1]");
	By comments=By.xpath("//textarea[@class='form-control mb-2']");
	By sendbutton=By.xpath("//button[@class='btn btn-primary']");
	By ksearch=By.xpath("//span[contains(text(),'Kudos Search')]");
	By searchbar=By.xpath("//input[@placeholder='*Search Kudos by Name or Email Address']");
	By searchpress=By.xpath("//*[@id='search_panel']/button");
	
	
	// By kudocount=By.xpath("//h5[@id='todayCount']");
	public Activity(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Sendkudoss() {
		return driver.findElement(send);
	}
	public WebElement NameEmail() {
		
		return driver.findElement(id);
		
	}
public WebElement kudotype1() {
		
		return driver.findElement(k1);
		
		
	}
public WebElement kudotype2() {
	
	return driver.findElement(k2);
	
	
}
public WebElement kudotype3() {
	
	return driver.findElement(k3);
	
	
}
public WebElement kudotype4() {
	
	return driver.findElement(k4);
	
	
}
public WebElement kudotype5() {
	
	return driver.findElement(k5);
	
	
}
public WebElement kudotype6() {
	
	return driver.findElement(k6);
	
	
}
public WebElement kudotype7() {
	
	return driver.findElement(k7);
	
	
}
public WebElement kudotype8() {
	
	return driver.findElement(k8);
	
	
}
public WebElement comments() {
	
	return driver.findElement(comments);
	
	
}
public WebElement send() {
	
	return driver.findElement(sendbutton);
	
	
}
public WebElement kudocount() {
	
	return driver.findElement(count);
	
	
}


public void screenshot() throws IOException {

	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\Qualitest\\Pictures\\Camera Roll\\ss111.png"));
	
}
public void kudostype(String kudostype)
{
WebElement kt=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
kt.click();
}

public WebElement searchkudo1() {
	return driver.findElement(ksearch);
}
public WebElement searchkudo2() {
	return driver.findElement(searchbar);
}
public WebElement searchkudo3() {
	return driver.findElement(searchpress);
}


}