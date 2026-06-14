import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input[1]")).click();
		String text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(text);

		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(text);

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(text)) {
			System.out.println("The alert contains the text entered - " + text);
		}

	}

}
