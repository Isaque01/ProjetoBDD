package br.com.rsinet.hub_bdd.pageObjects;

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
	
	@FindBy(how = How.ID, using ="tabletsImg")
	private WebElement categoria;
	
	public void click_categoria() {
		categoria.click();
	}
	
	

}
