package br.com.rsinet.hub_bdd.cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://advantageonlineshopping.com/#/");

		driver.manage().window().maximize();

		driver.findElement(By.id("menuUser")).click();

		WebElement element = driver.findElement(By.linkText("CREATE NEW ACCOUNT"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Isaque765");

		driver.findElement(By.name("emailRegisterPage")).sendKeys("isaque@hotmail.com");

		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Concret03");

		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Concret03");

		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Isaque");

		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Silva");

		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("11982397940");

		Select select = new Select(driver.findElement(By.name("countryListboxRegisterPage")));

		select.selectByVisibleText("Brazil");

		driver.findElement(By.name("cityRegisterPage")).sendKeys("Barueri");

		driver.findElement(By.name("addressRegisterPage")).sendKeys("Rua:Dora N°78 ");

		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Sao Paulo");

		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("06437-365");

		driver.findElement(By.name("i_agree")).click();

		driver.findElement(By.id("register_btnundefined")).click();

	}

	
}
