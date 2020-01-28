package br.com.rsinet.hub_bdd.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Produto_Page {

	WebDriver driver;

	public Produto_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement lupa;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement Complete;

	@FindBy(how = How.ID, using = "searchPage")
	private WebElement page;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div/div")
	private WebElement btnfechar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[1]")
	private WebElement mouseWait;
	
	@FindBy(how = How.LINK_TEXT, using = "HP Z3200 Wireless Mouse")
	private WebElement mouse;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"productProperties\"]/div[3]/button")
	private WebElement addCart;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")
	private WebElement msgSucesso;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement msgErro;
	
	
	public void click_lupa() {
		lupa.click();
	}

	public void enter_autoComplete(String autoComplete) {
		Complete.sendKeys(autoComplete + Keys.ENTER);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOf( page));
	}


	public void click_btnfechar() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(mouseWait));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnfechar);
	}

	
	public void Click_mouse() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mouse));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", mouse);

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOf(addCart));
		
	}
	
	public String getSucesso() {
		return msgSucesso.getText();
	}
	
	public String getErro() {
		return msgErro.getText();
	}
	

}
