package br.com.rsinet.hub_bdd.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProdutoCategoria_Page {
	WebDriver driver;

	public ProdutoCategoria_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Pesquisa pela catecoria na tela principal com sucesso
	@FindBy(how = How.ID, using = "tabletsImg")
	private WebElement tablet;
	
	public void categoria() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", tablet);
		
	}
	
	@FindBy(how = How.LINK_TEXT, using = "HP ElitePad 1000 G2 Tablet")
	private WebElement tabletHP;
	
	public void clicaProduto() {
		tabletHP.click();
	}

	//busca categoria pela tela principal com Erro
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"details_10\"]")
	private WebElement Elitebook;
	
	public void clicaDetalhe() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Elitebook);
		
	}
	
	
	

}
