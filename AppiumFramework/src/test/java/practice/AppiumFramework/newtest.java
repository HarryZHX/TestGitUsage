package practice.AppiumFramework;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;

public class newtest extends base2{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities("ApiDemos-debug.apk");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		HomePage h = new HomePage(driver);
		h.Preferences.click(); 
		//xpath
		AndroidElement element = driver.findElementByXPath("//android.widget.TextView[@text='Preference']");
		element.click();
		AndroidElement element1 = driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']");
		element1.click();
		AndroidElement element2 = driver.findElementById("android:id/checkbox");
		element2.click();
		//more items under class u need to use inx like array
		WebElement element3 = driver.findElementByXPath("(//android.widget.RelativeLayout)[2]");
		element3.click();
		AndroidElement element4 = driver.findElementById("android:id/edit");
		element4.sendKeys("hello"); 
		AndroidElement btnok = driver.findElementByXPath("//android.widget.Button[@text='OK']");
		btnok.click();
	
	
	}

}
