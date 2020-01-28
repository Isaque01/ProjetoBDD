
package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObjects.Home_Page;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
	
	TestContext testContext;
	 Home_Page homePage;
	 WebDriver driver;
	
	 public HomePageSteps(TestContext context) {
		 testContext = context;
		 homePage = testContext.getPageObjectManager().getHome_Page();
	 }
	
	@Given("^O usuário fornecido está na página inicial$")
	public void o_usuário_fornecido_está_na_página_inicial() throws Throwable {
		homePage.navigateTo_HomePage();

	}

	@When("^o usuário navega para a página de cadastro$")
	public void o_usuário_navega_para_a_página_de_cadastro() throws Throwable {
		homePage.perform_Search(null);
		homePage.Click_Username();
		homePage.Click_Create();

	}
	
	
	

}
