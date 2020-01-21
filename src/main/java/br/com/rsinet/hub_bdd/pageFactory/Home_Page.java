package br.com.rsinet.hub_bdd.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;
	
	public void HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void perform_Search(String search) {
		driver.navigate().to("http://advantageonlineshopping.com/#/" + search + "&post_type=product");
	}
	
	public void navigateTo_HomePage() {
		driver.get("http://advantageonlineshopping.com/#/");
	}
	
}
