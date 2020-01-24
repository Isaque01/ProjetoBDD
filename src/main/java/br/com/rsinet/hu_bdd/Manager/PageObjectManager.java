package br.com.rsinet.hu_bdd.Manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObjects.Home_Page;
import br.com.rsinet.hub_bdd.pageObjects.Produto_Page;
import br.com.rsinet.hub_bdd.pageObjects.Register_Page;

public class PageObjectManager {

	private WebDriver driver;
	
	private Home_Page homePage;
	
	private Produto_Page produtoPage;
	
	private  Register_Page registerPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public Home_Page getHomePage() {
		return(homePage == null) ? homePage = new Home_Page(driver): homePage;
	}
	public Produto_Page getprodutoPage() {
		return(produtoPage == null) ? produtoPage = new Produto_Page(driver): produtoPage;
	}
	public Register_Page getregisterPage() {
		return(registerPage == null) ? registerPage = new Register_Page(driver): registerPage;
	}
}
