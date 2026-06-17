import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		int rowsCount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		System.out.println(rowsCount);
		int columsCount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
		System.out.println(columsCount);

		List<WebElement> secondRowData = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		for (int i = 0; i < secondRowData.size(); i++)
			System.out.println(secondRowData.get(i).getText());

	}

}
