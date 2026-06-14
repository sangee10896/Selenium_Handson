import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		// Login Page
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		element.click();

		Select dropdown = new Select(driver.findElement(By.cssSelector("select.form-control")));
		dropdown.selectByVisibleText("Consultant");

		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();

		// Dashboard Page
		WebElement element1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn-primary")));

		List<WebElement> listOfItems = driver.findElements(By.cssSelector("button.btn-info"));
		ArrayList<WebElement> totalList = new ArrayList<>(listOfItems);

		for (WebElement ele : totalList) {

			ele.click();
		}

		driver.findElement(By.cssSelector("a.btn-primary")).click();

		// Checkout page

		WebElement element3 = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.btn-success")));

		System.out.println("Checkout page is displayed");
		driver.quit();

	}

}
