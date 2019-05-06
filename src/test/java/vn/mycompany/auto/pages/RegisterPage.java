package vn.mycompany.auto.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

	@FindBy(css = ".btn")
	private WebElementFacade clickbtnRegister;

	public void click_button_register_at_register_page() {
		clickbtnRegister.click();

	}

	@FindBy(id = "name")
	private WebElementFacade inputName;

	public void add_name_field_register(String name) {
		inputName.type(name);

	}

	@FindBy(id = "email")
	private WebElementFacade inputEmail;

	public void add_email_field_register(String email) {
		inputEmail.type(email);

	}

	@FindBy(id = "password")
	private WebElementFacade inputPassword;

	public void add_password_field_register(String password) {
		inputPassword.type(password);

	}

	@FindBy(id = "password_confirm")
	private WebElementFacade inputPasswordConfirm;

	public void add_password_confirm_field_register(String password_confirm) {
		inputPasswordConfirm.type(password_confirm);

	}

	@FindBy(id = "address")
	private WebElementFacade inputAddress;

	public void add_address_field_register(String address) {
		inputAddress.type(address);

	}

	@FindBy(id = "phone")
	private WebElementFacade inputPhone;

	public void add_phone_field_register(String phone) {
		inputPhone.type(phone);

	}

}
