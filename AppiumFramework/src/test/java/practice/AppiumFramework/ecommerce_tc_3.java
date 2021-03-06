package practice.AppiumFramework;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pageObjects.FormPage;

public class ecommerce_tc_3 extends base2 {
		@Test
	public void totalValidation() throws IOException, InterruptedException {
		startServer();

		AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FormPage P = new FormPage(driver);
		P.nameField.sendKeys("Hi");
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hi");
		driver.hideKeyboard();
		P.radioFemale.click();
		//driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		//TouchAction t = new TouchAction(driver);
		P.spinnerCountry.click();
		//driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		//	t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		//t.longPress(LongPressOptions.longPressOptions().withElement(element(sr1)).withDuration(ofSeconds(2))).release().perform();
		//AndroidElement country = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));");
		P.country.click();
		//country.click();
		//driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		P.LetsShop.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(text(\"Jordan 6 Rings\"));");		
		int counts = P.ProductNames.size();
		for(int i =0; i < counts; i++) {
			String text =  P.ProductNames.get(i).getText();
			if(text.equalsIgnoreCase( "Jordan 6 Rings")) {
				P.AddCartBtns.get(i).click();
			break;
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		driver.findElement(By.className("android.widget.CheckBox")).click();
//		WebElement lngPressBtn = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
//		TouchAction t = new TouchAction(driver);
//		t.longPress(longPressOptions().withElement(element(lngPressBtn)).withDuration(ofSeconds(2))).release().perform();
//		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(7000);
		Set<String> contexts = driver.getContextHandles();
		for(String contextName :contexts) {
			System.out.println(contextName);
		}
//appium provides how to use the phone back key
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	
	
	}
}
