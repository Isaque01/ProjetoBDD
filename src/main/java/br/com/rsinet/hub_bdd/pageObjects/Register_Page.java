package br.com.rsinet.hub_bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	public Register_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtbxUsername;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtbxEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtbxPassword;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtbxConfirmPassword;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtbxFirstName;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtbxLastName;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txtbxPhone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement listbxCountry;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txtbxCity;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txtbxAdress;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txtbxState;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txtbxPostal;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement chkAgree;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btnRegister;

	public void enter_Username(String userName) {
		txtbxUsername.sendKeys(userName);
	}

	public void enter_Email(String email) {
		txtbxEmail.sendKeys(email);
	}

	public void enter_Password(String password) {
		txtbxPassword.sendKeys(password);
	}

	public void enter_ConfirmPassword(String confirmPassword) {
		txtbxConfirmPassword.sendKeys(confirmPassword);
	}

	public void enter_FirstName(String firstName) {
		txtbxFirstName.sendKeys(firstName);
	}

	public void enter_LastName(String lastName) {
		txtbxLastName.sendKeys(lastName);
	}

	public void enter_Phone(String phone) {
		txtbxPhone.sendKeys(phone);
	}

	public void enter_Country(String country) {
		Select selectCountry = new Select(listbxCountry);
		selectCountry.selectByVisibleText(country);
	}

	public void enter_City(String city) {
		txtbxCity.sendKeys(city);
	}

	public void enter_Address(String adress) {
		txtbxAdress.sendKeys(adress);
	}

	public void enter_State(String state) {
		txtbxState.sendKeys(state);
	}

	public void enter_Postal(String postal) {
		txtbxPostal.sendKeys(postal);
	}

	public void clickAgree() {

		chkAgree.click();
	}

	public void clickBtnRegister() {

		btnRegister.click();
	}

	public void CadastroSucesso() {
		enter_Username("Isaque584");
		enter_Email("isaque.silva@rsinet.com.br");
		enter_Password("Concret03");
		enter_ConfirmPassword("Concret03");
		enter_FirstName("Isaque");
		enter_LastName("Silva");
		enter_Phone("11982397940");
		enter_Country("Brazil");
		enter_City("Barueri");
		enter_Address("Rua: Juliana N°78");
		enter_State("Sao Paulo");
		enter_Postal("06436350");
		clickAgree();
		clickBtnRegister();
	}
	public void CadastroErro() {
		enter_Username("Isaque");
		enter_Email("isaque.silva@rsinet.com.br");
		enter_Password("Concret03");
		enter_ConfirmPassword("Concret03");
		enter_FirstName("Isaque");
		enter_LastName("Silva");
		enter_Phone("11982397940");
		enter_Country("Brazil");
		enter_City("Barueri");
		enter_Address("Rua: Juliana N°78");
		enter_State("Sao Paulo");
		enter_Postal("06436350");
		clickAgree();
		clickBtnRegister();
	}
	
}
