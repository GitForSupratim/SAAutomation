package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseBasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tendable.com/");
		WebElement elm1 = driver.findElement(By.xpath("//*[@id=\"main-navigation-new\"]/ul/li[1]/a"));
		System.out.println(elm1.getText());
		WebElement elm2 = driver.findElement(By.xpath("//*[@id=\"main-navigation-new\"]/ul/li[2]/a"));
		System.out.println(elm2.getText());
		WebElement elm3 = driver.findElement(By.xpath("//*[@id=\"main-navigation-new\"]/ul/li[3]/a"));
		System.out.println(elm3.getText());
		WebElement elm4 = driver.findElement(By.xpath("//*[@id=\"main-navigation-new\"]/ul/li[4]/a"));
		System.out.println(elm4.getText());
		WebElement elm5 = driver.findElement(By.xpath("//*[@class=\"w-full sticky top-0 z-1000\"]/div/a/img"));
		System.out.println(elm5.getText());
		WebElement elm6 = driver.findElement(By.xpath("/html/body/header/div/div[1]/a[3]"));
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/header/div/div[1]/a[3]"));
		if(elements.size() > 0) {
			System.out.println("Element is present "+elm6.getText());
			}
		else {
			System.out.println("Element is not present");
		}
		WebElement contact = driver.findElement(By.xpath("/html/body/header/div/div[1]/a[1]"));
		contact.click();
		WebElement marketing = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/div/div[2]/div[2]/button"));
		marketing.click();
		
		driver.findElement(By.id("form-input-fullName")).sendKeys("Pals");
		driver.findElement(By.id("form-input-organisationName")).sendKeys("xyz");
		driver.findElement(By.id("form-input-cellPhone")).sendKeys("8605071464");
		driver.findElement(By.id("form-input-email")).sendKeys("pals@ghj.com");
		WebElement dropdownelement = driver.findElement(By.id("form-input-jobRole"));
		Select dropdown = new Select(dropdownelement);
		dropdown.selectByIndex(2);
		WebElement radioButton = driver.findElement(By.id("form-input-consentAgreed-0"));
		Thread.sleep(20000);
		radioButton.click();
		if (radioButton.isSelected()) {
            System.out.println("Radio button is selected.");
        } else {
            System.out.println("Radio button is not selected.");
        }
		Thread.sleep(20000);
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[1]/form/div[11]/div/button")).click();
		///html/body/div[4]/div/div[1]/div/div[1]/form/div[11]/div/button
		//#contactMarketingPipedrive-163701 > div:nth-child(19) > div > button
		driver.findElement(By.cssSelector("driver.findElement(By.xpath(\"/html/body/div[4]/div/div[1]/div/div[1]/form/div[11]/div/button\"))")).click();
		
	}

}
