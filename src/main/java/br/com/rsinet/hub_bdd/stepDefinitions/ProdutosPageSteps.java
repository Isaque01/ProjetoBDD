package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hu_bdd.Manager.WebDriverManager;
import br.com.rsinet.hub_bdd.pageObjects.ProdutoCategoria_Page;
import br.com.rsinet.hub_bdd.pageObjects.Produto_Page;
import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ProdutosPageSteps {

	WebDriver driver;
	ProdutoCategoria_Page produtoCategoriaPage;
	WebDriverManager WebDriverManager;
	TestContext testContext;
	Produto_Page produtoPage;

	public ProdutosPageSteps(TestContext context) {
		testContext = context;
		produtoPage = testContext.getPageObjectManager().getProdutoPage();
		produtoCategoriaPage = testContext.getPageObjectManager().getProdutoCategoriaPage();
		WebDriverManager = testContext.getWebDriverManager();
		driver = WebDriverManager.getDriver();
	}

	// busca produto válido pela lupa com sucesso
	@When("^o usuário clica na barra de pesquisa$")
	public void o_usuário_clica_na_barra_de_pesquisa() throws Throwable {
		produtoPage.click_lupa();

	}

	@And("^digitar o nome do produto$")
	public void digitar_o_nome_do_produto() throws Throwable {
		produtoPage.enter_autoComplete("Mouse");
		produtoPage.click_btnfechar();
		produtoPage.Click_mouse();

	}

	@Then("^será direcionado para a página produtos$")
	public void será_direcionado_para_a_página_produtos() throws Throwable {
        String msgSucesso = produtoPage.getSucesso();
		String deveConter = "HP Z3200 WIRELESS MOUSE";
		Assert.assertEquals(true, msgSucesso.contains(deveConter));
		System.out.println("Produto encontrado com sucesso");

	}

	// busca produto invalido pela lupa
	@When("^digitar o nome do produto invalido$")
	public void digitar_o_nome_do_produto_invalido() throws Throwable {
		produtoPage.enter_autoComplete("carro");

	}

	@Then("^será direcionado para a página produtos não existente$")
	public void será_direcionado_para_a_página_produtos_não_existente() throws Throwable {
        String msgErro = produtoPage.getErro();
		String deveConter = "No results for";
		Assert.assertEquals(true, msgErro.contains(deveConter));
		System.out.println("Prduto na existe");

	}

	// buscar produto por categoria válido

	@When("^clicar na categoria selecionada$")
	public void clicar_na_categoria_selecionada() throws Throwable {
		produtoCategoriaPage.categoria();

	}

	@And("^clique no tablet escolhido$")
	public void clique_no_tablet_escolhido() throws Throwable {
		produtoCategoriaPage.clicaProduto();

	}

	@Then("^a página do tablet escolhido será escolhido$")
	public void a_página_do_tablet_escolhido_será_escolhido() throws Throwable {

		System.out.println("Produto escolhi com sucesso");
	}
	// busca produto categoria invalido

	@When("^o Usuario clicar para ver detalhes do laptop$")
	public void o_Usuario_clicar_para_ver_detalhes_do_laptop() throws Throwable {
		produtoCategoriaPage.clicaDetalhe();

	}

	@Then("^Será exibida a página de outro laptop$")
	public void será_exibida_a_página_de_outro_laptop() throws Throwable {
		System.out.println("Laptop errado");
	}

}
