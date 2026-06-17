import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#autocomplete")).click();
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("Ind");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-menu-item")));
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.cssSelector("input#autocomplete")).getAttribute("value"));

	}

}
