package br.com.rsinet.hub_bdd.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hu_bdd.Manager.FileReaderManager;
import dataProvider.ConfigFileReader;

public class Home_Page {
	WebDriver driver;
	ConfigFileReader configFileReader;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
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
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl() + "/?s=" + search
				+ "&post_type=product");
	}

	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	

}
