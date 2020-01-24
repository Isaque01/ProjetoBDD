package br.com.rsinet.hub_bdd.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUserLink")
	private WebElement btn_UserName;

	public void Click_Username() {
		btn_UserName.click();
	}

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement btn_Create;

	public void Click_Create() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btn_Create);
	}

	public void perform_Search(String search) {
		driver.navigate().to("http://advantageonlineshopping.com/#/" + search + "&post_type=product");
	}

	public void navigateTo_HomePage() {
		driver.get("http://advantageonlineshopping.com/#/");
	}

}
