package br.com.rsinet.hub_bdd.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hu_bdd.Manager.PageObjectManager;
import br.com.rsinet.hub_bdd.pageObjects.Home_Page;
import br.com.rsinet.hub_bdd.pageObjects.ProdutoCategoria_Page;
import br.com.rsinet.hub_bdd.pageObjects.Produto_Page;
import br.com.rsinet.hub_bdd.pageObjects.Register_Page;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class Test_Steps {
	WebDriver driver;
	Home_Page homePage;
	Produto_Page produtoPage;
	ProdutoCategoria_Page produtoCategoriaPage;
	Register_Page registroPage;
	PageObjectManager PageObjectManager;
	//ConfigFileReader configFileReader;
	


	@Dado("^O usuário fornecido está na página inicial$")
	public void o_usuário_fornecido_está_na_página_inicial() throws Throwable {
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		PageObjectManager = new PageObjectManager(driver);
		homePage = PageObjectManager.getHome_Page();
		homePage.navigateTo_HomePage();

	}

	@Quando("^o usuário navega para a página de cadastro$")
	public void o_usuário_navega_para_a_página_de_cadastro() throws Throwable {
		homePage.perform_Search(null);
		// Home_Page home = new Home_Page(driver);
		homePage.Click_Username();
		homePage.Click_Create();

	}

	// Pagina cadastro com sucesso
	@E("^o usuário digita os dados corretos$")
	public void o_usuário_digita_os_dados_corretos() throws Throwable {
		registroPage = PageObjectManager.getRegisterPage();
		registroPage.CadastroSucesso();

	}

	@Então("^será direcionado para a página lougado$")
	public void será_direcionado_para_a_página_lougado() throws Throwable {

		System.out.println("lougado com sucesso");

	}

	// Pagina de cadastro invalido
	@E("^o usuário digita os dados incorretos$")
	public void o_usuário_digita_os_dados_incorretos() throws Throwable {
		registroPage = PageObjectManager.getRegisterPage();
		registroPage.CadastroErro();

	}

	@Então("^usuário não será cadastrado$")
	public void usuário_não_será_cadastrado() throws Throwable {

		System.out.println("Erro ao lougar");
	}

	// busca produto valido pela lupa com sucesso
	@Quando("^o usuário clica na barra de pesquisa$")
	public void o_usuário_clica_na_barra_de_pesquisa() throws Throwable {
		produtoPage = PageObjectManager.getProdutoPage();
		produtoPage.click_lupa();

	}

	@E("^digitar o nome do produto$")
	public void digitar_o_nome_do_produto() throws Throwable {
		produtoPage = PageObjectManager.getProdutoPage();
		produtoPage.enter_autoComplete("Mouse");
		produtoPage.click_btnfechar();
		produtoPage.Click_mouse();

	}

	@Então("^será direcionado para a página produtos$")
	public void será_direcionado_para_a_página_produtos() throws Throwable {
		System.out.println("Produto encontrado com sucesso");

	}

	// busca produto pela lupa invalido
	@Quando("^digitar o nome do produto invalido$")
	public void digitar_o_nome_do_produto_invalido() throws Throwable {
		produtoPage = PageObjectManager.getProdutoPage();
	    produtoPage.enter_autoComplete("carro");
	}

	@Então("^será direcionado para a página produtos não existente$")
	public void será_direcionado_para_a_página_produtos_não_existente() throws Throwable {
		System.out.println("Prduto na existe");

	}

	// buscar produto por categoria valido

	@Quando("^clicar na categoria selecionada$")
	public void clicar_na_categoria_selecionada() throws Throwable {
		produtoCategoriaPage = PageObjectManager.getProCategoria_Page();
	    produtoCategoriaPage.categoria();

	}

	@E("^clique no tablet escolhido$")
	public void clique_no_tablet_escolhido() throws Throwable {
		produtoCategoriaPage = PageObjectManager.getProCategoria_Page();
		produtoCategoriaPage.clicaProduto();

	}

	@Então("^a página do tablet escolhido será escolhido$")
	public void a_página_do_tablet_escolhido_será_escolhido() throws Throwable {

		System.out.println("Produto escolhi com sucesso");
	}
	// busca produto categori invalido

	@Quando("^o Usuario clicar para ver detalhes do laptop$")
	public void o_Usuario_clicar_para_ver_detalhes_do_laptop() throws Throwable {
		produtoCategoriaPage = PageObjectManager.getProCategoria_Page();
		produtoCategoriaPage.clicaDetalhe();

	}

	@E("^clicar no laptop$")
	public void clicar_no_laptop() throws Throwable {
		produtoCategoriaPage = PageObjectManager.getProCategoria_Page();
		produtoCategoriaPage.clicaDetalhe();
	}

	@Então("^Será exibida a página de outro laptop$")
	public void será_exibida_a_página_de_outro_laptop() throws Throwable {
		System.out.println("Laptop errado");
	}

}
