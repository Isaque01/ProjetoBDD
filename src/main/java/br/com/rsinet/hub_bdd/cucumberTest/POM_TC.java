package br.com.rsinet.hub_bdd.cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_TC {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/#/");
		
		
	}
	

	
}
