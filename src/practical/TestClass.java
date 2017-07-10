package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	public static void main(String[] args) {
		// Initiate Driver for Firefox Browser
		WebDriver driver = new FirefoxDriver();
		// Maximize window
		driver.manage().window().maximize();
		// open target Web Application
		driver.get("http://www.elitecareer.net/");
		// Collect target WebElement by inspect and store in a container
		WebElement SignInLinkWebElement = driver.findElement(By.linkText("Signin"));
		// next step function
		SignInLinkWebElement.click();
		// Web Application & browser tear down
		driver.quit();

	}

}
