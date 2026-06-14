import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Name
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Sangeetha");

		// email

		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("xxx@gmail.com");

		// password

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");

		// checkbox

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// dropdown

		Select gender = new Select(driver.findElement(By.xpath("//*[@id='exampleFormControlSelect1']")));
		gender.selectByVisibleText("Female");

		// radio button

		driver.findElement(By.xpath("//input[@value='option1']")).click();

		// birthday

		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("08/10/1996");

		// submit

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		// successfull message

		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

		driver.quit();

	}

}
