package br.com.rsinet.hub_bdd.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

	@Dado("^O usuário fornecido está na página inicial$")
	public void o_usuário_fornecido_está_na_página_inicial() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");

	}

	@Quando("^o usuário navega para a página de cadastro$")
	public void o_usuário_navega_para_a_página_de_cadastro() throws Throwable {
		Home_Page home = new Home_Page(driver);
		home.Click_Username();
		home.Click_Create();

	}

	//Pagina cadastro com sucesso
	@E("^o usuário digita os dados corretos$")
	public void o_usuário_digita_os_dados_corretos() throws Throwable {
		Register_Page register = new Register_Page(driver);
		register.CadastroSucesso();

	}

	@Então("^será direcionado para a página lougado$")
	public void será_direcionado_para_a_página_lougado() throws Throwable {

		System.out.println("lougado com sucesso");

	}
	
    // Pagina de cadastro invalido 
	@E("^o usuário digita os dados incorretos$")
	public void o_usuário_digita_os_dados_incorretos() throws Throwable {
		Register_Page register = new Register_Page(driver);
		register.CadastroErro();

	}

	@Então("^usuário não será cadastrado$")
	public void usuário_não_será_cadastrado() throws Throwable {

		System.out.println("Erro ao lougar");
	}

	// busca produto valido pela lupa com sucesso
	@Quando("^o usuário clica na barra de pesquisa$")
	public void o_usuário_clica_na_barra_de_pesquisa() throws Throwable {
		Produto_Page produto = new Produto_Page(driver);
		produto.click_lupa();

	}

	@E("^digitar o nome do produto$")
	public void digitar_o_nome_do_produto() throws Throwable {
		Produto_Page digita = new Produto_Page(driver);
		digita.enter_autoComplete("Mouse");
		digita.click_btnfechar();
		digita.Click_mouse();

	}

	@Então("^será direcionado para a página produtos$")
	public void será_direcionado_para_a_página_produtos() throws Throwable {
		System.out.println("Produto encontrado com sucesso");

	}
     // busca produto pela lupa invalido
	@Quando("^digitar o nome do produto invalido$")
	public void digitar_o_nome_do_produto_invalido() throws Throwable {
		Produto_Page digita = new Produto_Page(driver);
		digita.enter_autoComplete("carro");
	}

	@Então("^será direcionado para a página produtos não existente$")
	public void será_direcionado_para_a_página_produtos_não_existente() throws Throwable {
		System.out.println("Prduto na existe");

	}
	
	// buscar produto por categoria valido

	@Quando("^clicar na categoria selecionada$")
	public void clicar_na_categoria_selecionada() throws Throwable {
		ProdutoCategoria_Page clicar = new ProdutoCategoria_Page(driver);
		clicar.categoria();
		

	}

	@E("^clique no tablet escolhido$")
	public void clique_no_tablet_escolhido() throws Throwable {
		ProdutoCategoria_Page Produto = new ProdutoCategoria_Page(driver);
		Produto.clicaProduto();

	}

	@Então("^a página do tablet escolhido será escolhido$")
	public void a_página_do_tablet_escolhido_será_escolhido() throws Throwable {

		System.out.println("Produto escolhi com sucesso");
	}
	//busca produto categori invalido
	
	@Quando("^o Usuario clicar para ver detalhes do laptop$")
	public void o_Usuario_clicar_para_ver_detalhes_do_laptop() throws Throwable {
		ProdutoCategoria_Page VerDetalhe = new ProdutoCategoria_Page(driver);
		VerDetalhe.clicaDetalhe();
	    
	}
	@E("^clicar no laptop$")
	public void clicar_no_laptop() throws Throwable {
		ProdutoCategoria_Page laptop = new ProdutoCategoria_Page(driver);
		laptop.clicaDetalhe();
	}

	@Então("^Será exibida a página de outro laptop$")
	public void será_exibida_a_página_de_outro_laptop() throws Throwable {
	   System.out.println("Laptop errado");
	}

}
