package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import PageObject.Loginpage;

public class Base {
  public WebDriver driver; 
  public Properties prop;
  
  public static org.apache.logging.log4j.Logger log1;
  @BeforeSuite

  public void Bsuite() throws FileNotFoundException, IOException {

  String log4jConfigFile=("C:\\Users\\Qualitest\\QT\\src\\main\\java\\Resources\\log4j2.xml");

  ConfigurationSource source=new ConfigurationSource(new FileInputStream(log4jConfigFile));

  Configurator.initialize(null,source);

  log1=LogManager.getLogger(Base.class.getName());

   

  }
  
	public  WebDriver initializeDriver() throws IOException {
		 
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\QT\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;

		
	
}

//	private void login2() {
//		// TODO Auto-generated method stub
//		
//	}
}