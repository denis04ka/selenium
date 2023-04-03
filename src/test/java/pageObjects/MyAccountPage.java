package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement msgHeading;
	
	public boolean isMyAccountPageExists() {
		try {
			return (msgHeading.isDisplayed());
		}catch(Exception e) {
			return (false);
		}
	}
	
	public void clickLogout() {
		By css = By.cssSelector("body main a:nth-child(13)");
		WebElement element = driver.findElement(css);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
	}

}
