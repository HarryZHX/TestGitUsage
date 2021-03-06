package practice.AppiumFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base2 {
	public static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> driver;
	public AppiumDriverLocalService startServer() {
		//
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		return service;     
	}
	
	public static AndroidDriver<AndroidElement> Capabilities(String appName) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\practice\\AppiumFramework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
				// TODO Auto-generated method stub
		File f = new File("src");
		File fs = new File(f,(String) prop.get(appName));
		
		DesiredCapabilities cap = new DesiredCapabilities();
		String device = (String) prop.get("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
	public void getScreenshot() {
		File scrfile = driver.getScreenshotAs(OutputType.FILE);
		
	}

}
