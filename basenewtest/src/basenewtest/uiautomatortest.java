package basenewtest;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiautomatortest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//xpath
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		List<AndroidElement> a = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
		System.out.println(a.size());
		
		
		
	}

}
