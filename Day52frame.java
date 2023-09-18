package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day52frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// visiting the url
		driver.get("https://www.webdriveruniversity.com/IFrame/index.html");

		// Iframe

		// WebElement ele = driver.findElement(By.cssSelector("#frame"));

		// driver.switchTo().frame(ele);

		// switch to iframe by index

		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a"));

		System.out.println(ele2.isDisplayed());

		// switching back to main content

		driver.switchTo().defaultContent();

		// finding element in main content
		driver.findElement(By.cssSelector("#nav-title")).isDisplayed();

		// validate the title of main content
		if (driver.getTitle().equals("WebDriver | IFrame")) {
			System.out.println("test case pass");
		} 
		else {
			System.out.println("Test case fail");
		}

		// closing the browser
		driver.close();
	}
}
