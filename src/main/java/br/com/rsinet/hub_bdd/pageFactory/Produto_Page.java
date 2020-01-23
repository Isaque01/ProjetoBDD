package br.com.rsinet.hub_bdd.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Produto_Page {
	
	public Produto_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	


}
