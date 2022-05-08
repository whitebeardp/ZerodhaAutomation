package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.gmailfpage;
import Pojo.Browser;

public class gmail {
	WebDriver driver;
	
	@BeforeMethod
	public void lanbro() {
		driver=Browser.OpenBrowser("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println("hi");
	}
	
	
	
	@Test
	public void enteremailId() throws InterruptedException {
		gmailfpage fr=new gmailfpage(driver);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
			fr.entrid("satyajitmohite79@gmail.com");
	 
		Thread.sleep(2000);
		fr.clicOnNext();
		
	}
	
	@Test
	
	public void sample() {
		System.out.println("changes");
	}

}
