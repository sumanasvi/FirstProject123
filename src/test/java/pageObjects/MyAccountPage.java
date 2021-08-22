package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage
{
	WebDriver driver;
	 
	 public MyAccountPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath="//*[@class=\"dropdown-menu dropdown-menu-right\"]")
	 WebElement AccountDropDown;
	 
	 
	 @FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
	 WebElement InkLogout;
	 
	 public void clickLogout()
	 {
		 InkLogout.click();
	 }

	 public void acctRightMenu()
	 {
		 AccountDropDown.click();
	 }
	 
}
