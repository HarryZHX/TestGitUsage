package basenewtest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class swipedemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement element1 = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		element1.click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		//if there is $ or other signs in the Xpath you can not use it as appium does not recognize it but you can use it as *
		//*to replace Xpathname
		driver.findElementByXPath("//*[@content-desc='9']") .click();
		TouchAction t = new TouchAction(driver);
		WebElement fst = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement sec = driver.findElementByXPath("//*[@content-desc='45']");
		//find two elements, long press 1 then grap1 to 2 element
		t.longPress(LongPressOptions.longPressOptions().withElement(element(fst)).withDuration(ofSeconds(2))).moveTo(element(sec)).release().perform();	
	
	
	}

}
