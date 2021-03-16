package basenewtest;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
public class draganddrop extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement element1 = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		element1.click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		TouchAction t = new TouchAction(driver);
		//longpress + moveto+release (//android.widget.RelativeLayout)[2]
		List<AndroidElement> sources = driver.findElements(By.xpath("//android.view.View"));
		WebElement source = sources.get(0);
		WebElement destination = sources.get(1);
		//if you dont have more tasks to do after longpressing(except move to) you
		// can write like this t.longPress(element(source)).moveTo(element(destination))
		t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	}

}
