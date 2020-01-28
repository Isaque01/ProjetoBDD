package br.com.rsinet.hub_bdd.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProdutoCategoria_Page {
	WebDriver driver;

	public ProdutoCategoria_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Pesquisa pela categoria na tela principal com sucesso
	
	@FindBy(how = How.LINK_TEXT, using = "HP ElitePad 1000 G2 Tablet")
	private WebElement tabletHP;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"productProperties\"]/div[3]/button")
	private WebElement AddCart;
	
	@FindBy(how = How.ID, using = "tabletsImg")
	private WebElement tablet;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"popular_items\"]/div/div[2]/a")
	private WebElement Elitebook;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"productProperties\"]/div[3]/button")
	private WebElement addToCart;
	
	public void categoria() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", tablet);
		
	}
	
	
	
	public void clicaProduto() throws InterruptedException {
		tabletHP.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		
	}

	//busca categoria pela tela principal com Erro
	
	
	public void clicaDetalhe() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Elitebook);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		
	}
	
	
	

}
