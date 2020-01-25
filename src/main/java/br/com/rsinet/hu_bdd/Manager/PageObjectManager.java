package br.com.rsinet.hu_bdd.Manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObjects.Home_Page;
import br.com.rsinet.hub_bdd.pageObjects.ProdutoCategoria_Page;
import br.com.rsinet.hub_bdd.pageObjects.Produto_Page;
import br.com.rsinet.hub_bdd.pageObjects.Register_Page;

public class PageObjectManager {

	private WebDriver driver;
	private Home_Page homePage;
	private Produto_Page produtoPage;
	private  Register_Page registerPage;
	private ProdutoCategoria_Page produtocategoriapage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public Home_Page getHome_Page() {
		return(homePage == null) ? homePage = new Home_Page(driver): homePage;
	}
	public Produto_Page getProdutoPage() {
		return(produtoPage == null) ? produtoPage = new Produto_Page(driver): produtoPage;
	}
	public Register_Page getRegisterPage() {
		return(registerPage == null) ? registerPage = new Register_Page(driver): registerPage;
	}
	public ProdutoCategoria_Page getProCategoria_Page() {
		return(produtocategoriapage == null) ? produtocategoriapage = new ProdutoCategoria_Page(driver): produtocategoriapage;
		
	}
}
