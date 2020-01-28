package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hu_bdd.Manager.WebDriverManager;
import br.com.rsinet.hub_bdd.pageObjects.Produto_Page;
import br.com.rsinet.hub_bdd.pageObjects.Register_Page;
import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CadastroPageSteps {

	WebDriver driver;
	Produto_Page produtoPage;
	Register_Page registroPage;
	WebDriverManager WebDriverManager;

	TestContext testContext;

	public CadastroPageSteps(TestContext context) {
		testContext = context;
		registroPage = testContext.getPageObjectManager().getRegisterPage();
		WebDriverManager = testContext.getWebDriverManager();
	}

	// Página cadastro com sucesso
	@And("^o usuário digita os dados corretos$")
	public void o_usuário_digita_os_dados_corretos() throws Throwable {
		registroPage.CadastroSucesso();

	}

	@Then("^será direcionado para a página lougado$")
	public void será_direcionado_para_a_página_lougado() throws Throwable {
		System.out.println("lougado com sucesso");

	}

	// Página de cadastro invalido
	@And("^o usuário digita os dados incorretos$")
	public void o_usuário_digita_os_dados_incorretos() throws Throwable {
		registroPage.CadastroErro();

	}

	@Then("^usuário não será cadastrado$")
	public void usuário_não_será_cadastrado() throws Throwable {
		System.out.println("Erro ao lougar");

	}

}