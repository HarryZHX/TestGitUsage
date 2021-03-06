package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {

	// all the objects belonging to one page will be defined in this java class
	// with constructor idea you can call the driver ovject from testcase to pageobject file
		public FormPage(AppiumDriver driver) 
		{
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}	
		@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
		public WebElement nameField;
		//com.androidsample.generalstore:id/radioFemale
		@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
		public WebElement radioFemale;
		//com.androidsample.generalstore:id/spinnerCountry
		@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
		public WebElement spinnerCountry;
	//new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));
		@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));")
		public WebElement country;
		//com.androidsample.generalstore:id/btnLetsShop
		@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
		public WebElement LetsShop;
	//new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(text(\"Jordan 6 Rings\"));"
//		@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(text(\"Jordan 6 Rings\"));")
//		public WebElement J6;
	//com.androidsample.generalstore:id/productName
		@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
		public List<WebElement> ProductNames;	
		@AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
		public List<WebElement> AddCartBtns;	
}
