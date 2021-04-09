package PageObject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class RecentCont {
	    public WebDriver driver;
	    By rckudossearch=By.xpath("(//div[@id=\"contact_list\"]//a[@href=\"#myModal\"])[1]");
	    By kudos1=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	    By comments1=By.xpath("//textarea[@id='comment']");
	    By sendbutton1=By.xpath("//button[contains(text(),'Send')]");
	    By cancelbutton1=By.xpath("//button[contains(text(),'Cancel')]");
	    public RecentCont(WebDriver driver2) {
	        this.driver=driver2;
	    }
	    public void kudostype(String kudostype)
	    {
	        WebElement kt=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
	        kt.click();
	    }
	    public WebElement RCKudosSearch() {
	        return driver.findElement(rckudossearch);
	    }
	    public WebElement Comments() {
	        return driver.findElement(comments1);
	        
	        
	    }
	    public WebElement SendButton() {
	        return driver.findElement(sendbutton1);
	        
	        
	    }
	    public WebElement CancelButton() {
	        return driver.findElement(cancelbutton1);
	        
	        
	    }
	}

