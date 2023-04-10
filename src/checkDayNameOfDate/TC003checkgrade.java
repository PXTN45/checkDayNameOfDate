package checkDayNameOfDate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC003checkgrade {

	@Test
	void test01() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Home
		driver.get("http://localhost:3000/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Nattaphong Sriphaophan");
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("2023/04/10");
//		driver.findElement(By.xpath("//*[@id=\"score\"]")).sendKeys("99");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		Thread.sleep(4000);
		String result = driver.switchTo().alert().getText();
		assertEquals("Please Enter Score", result);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.close();
		
	}
}
