package br.com.rsinet.hub_bdd.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class Test_Steps {
	
	WebDriver driver;
	
	@Quando("^O usuário fornecido está na página inicial$")
	public void o_usuário_fornecido_está_na_página_inicial() throws Throwable {
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://advantageonlineshopping.com/#/");

	    throw new PendingException();
	}

	@Quando("^o usuário navega para a página de login$")
	public void o_usuário_navega_para_a_página_de_login() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
	    throw new PendingException();
	}

	@Quando("^o usuário digita o nome de usuário e a senha$")
	public void o_usuário_digita_o_nome_de_usuário_e_a_senha() throws Throwable {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Isaque765");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Concret03");
	    throw new PendingException();
	}

	@Então("^Mensagem exibida Login com êxito$")
	public void mensagem_exibida_Login_com_êxito() throws Throwable {
	    System.out.println("Login Sucesso");
		throw new PendingException();
	}

	@Quando("^o Logoff do Usuário do Aplicativo$")
	public void o_Logoff_do_Usuário_do_Aplicativo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^Mensagem exibida Logout com êxito$")
	public void mensagem_exibida_Logout_com_êxito() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
