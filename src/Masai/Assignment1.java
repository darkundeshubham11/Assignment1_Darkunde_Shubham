package Masai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.masaischool.com/");
		try {
			// By ID
			WebElement elementById = driver.findElement(By.id("element_id"));
			System.out.println("Element by ID: " + elementById);

			// By Name
			WebElement elementByName = driver.findElement(By.name("element_name"));
			System.out.println("Element by Name: " + elementByName);

			// By Class Name
			WebElement elementByClassName = driver.findElement(By.className("element_class"));
			System.out.println("Element by Class Name: " + elementByClassName);

			// By Tag Name
			WebElement elementByTagName = driver.findElement(By.tagName("tag_name"));
			System.out.println("Element by Tag Name: " + elementByTagName);

			// By Link Text
			WebElement elementByLinkText = driver.findElement(By.linkText("link_text"));
			System.out.println("Element by Link Text: " + elementByLinkText);

			// By Partial Link Text
			WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("partial_link_text"));
			System.out.println("Element by Partial Link Text: " + elementByPartialLinkText);

			// By XPath
			WebElement elementByXPath = driver.findElement(By.xpath("xpath"));
			System.out.println("Element by XPath: " + elementByXPath);

			// By CSS Selector
			WebElement elementByCssSelector = driver.findElement(By.cssSelector("css_selector"));
			System.out.println("Element by CSS Selector: " + elementByCssSelector);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Close the browser
		driver.quit();
	}

}
