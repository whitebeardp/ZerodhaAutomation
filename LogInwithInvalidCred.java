package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.PINPage;
import POM.ZerodhaLogIn;
import Pojo.Browser;
import Utility.ScreenShot;
import Utility.excel;


public class LogInwithInvalidCred {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBro() {
		driver=Browser.OpenBrowser("https://kite.zerodha.com/");
		
	}

	@Test
	public void ValidCredential() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ZerodhaLogIn valid=new ZerodhaLogIn(driver);
		String UserID=excel.zerodha(0, 1, "cred");
		valid.enterusername(UserID);
		
		String Passward=excel.zerodha(1, 1, "cred");
		valid.enterpassward(Passward);
		
		valid.ClickOnLogin();
		//Thread.sleep(2000);
		PINPage pin=new PINPage(driver);
		String Pin=excel.zerodha(2, 1, "cred");
		pin.EnterPin(Pin);
		
		pin.ClickOnSubmit();
	}
	
	//@Test(priority=-1)
	public void LoginwithBlankCred() {
		ZerodhaLogIn invalid=new ZerodhaLogIn(driver);
		invalid.ClickOnLogin();
	}
	 
//	@AfterMethod
	
	public void TakeScreenShot() throws IOException {
		
		ScreenShot.takess(driver, "zero");
	}
}