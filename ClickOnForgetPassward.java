 package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaLogIn;
import Pojo.Browser;

public class ClickOnForgetPassward {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
		driver=Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	
	@Test
	public void ClickOnForget()
	{
		ZerodhaLogIn forget=new ZerodhaLogIn(driver);
		forget.ClickonforgotIDPassward();
	}
}
