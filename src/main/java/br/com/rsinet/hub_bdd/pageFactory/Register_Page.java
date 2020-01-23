package br.com.rsinet.hub_bdd.pageFactory;

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

	public void entreUsername(String userName) {
		txtbxUsername.sendKeys(userName);
	}

	public void entreEmail(String email) {
		txtbxEmail.sendKeys(email);
	}

	public void entrePassword(String password) {
		txtbxPassword.sendKeys(password);
	}

	public void entreConfirmPassword(String confirmPassword) {
		txtbxConfirmPassword.sendKeys(confirmPassword);
	}

	public void entreFirstName(String firstName) {
		txtbxFirstName.sendKeys(firstName);
	}

	public void entreLastName(String lastName) {
		txtbxLastName.sendKeys(lastName);
	}

	public void entrePhone(String phone) {
		txtbxPhone.sendKeys(phone);
	}

	public void entreCountry(String country) {
		Select selectCountry = new Select(listbxCountry);
		selectCountry.selectByVisibleText(country);
	}

	public void entreCity(String city) {
		txtbxCity.sendKeys(city);
	}

	public void entreAddress(String adress) {
		txtbxAdress.sendKeys(adress);
	}

	public void entreState(String state) {
		txtbxState.sendKeys(state);
	}

	public void entrePostal(String postal) {
		txtbxPostal.sendKeys(postal);
	}

	public void clickAgree(boolean value) {
		if (value)
			chkAgree.click();
	}

	public void clickBtnRegister(boolean value) {
		if (value)
			btnRegister.click();
	}

	public void fill_AccountDetails() {
		entreUsername("Isaque");
		entreEmail("isaque.silva@rsinet.com.br");
		entrePassword("Concret03");
		entreConfirmPassword("Concret03");
	}
	
	public void fill_InvalidAccountDetails() {
		entreUsername("Isaque");
		entreEmail("isaque.silva@rsinet.com.br");
		entrePassword("12345");
		entreConfirmPassword("12345");
	}

	public void fillPersonalDetails() {
		entreFirstName("isaque");
		entreLastName("Silva");
		entrePhone("11982397940");
	}

	public void fillAddress() {

		entreCity("Barueri");
		entreAddress("Rua: Juliana");
		entrePostal("06436350");
		entreState("SP");
		entreCountry("Brazil");
	}
}

	


