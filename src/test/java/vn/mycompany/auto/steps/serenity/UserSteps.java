package vn.mycompany.auto.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import net.thucydides.core.annotations.Step;
import vn.mycompany.auto.pages.HomePage;
import vn.mycompany.auto.pages.LoginPage;
import vn.mycompany.auto.pages.RegisterPage;

public class UserSteps {

	HomePage homePage;
	LoginPage loginPage;
	RegisterPage registerPage;

	@Step
	public void enters(String keyword) {
		homePage.enter_keywords(keyword);
	}

	@Step
	public void starts_search() {
		homePage.lookup_terms();
	}

	@Step
	public void should_see_definition(String definition) {
		assertThat(homePage.getDefinitions(), hasItem(containsString(definition)));
	}

	@Step
	public void is_the_home_page() {
		homePage.open();
	}

	@Step
	public void looks_for(String term) {
		enters(term);
		starts_search();
	}

	@Step
	public void click_button_login_at_home_page() {
		homePage.click_button_login_at_home_page();
	}
	
	@Step
	public void click_button_register_at_home_page() {
		homePage.click_button_register_at_home_page();
	}
	
	@Step
	public void click_button_login_at_login_page() {
		loginPage.click_button_login_at_login_page();
		
	}

	@Step
	public void input_email_at_login_page(String email) {
		loginPage.add_email_field(email);
		
	}
	
	@Step
	public void input_password_at_login_page(String password) {
		loginPage.add_password_field(password);
		
	}

	@Step
	public void click_button_register_at_register_page() {
		registerPage.click_button_register_at_register_page();
		
	}

	@Step
	public void input_email_at_register_page(String email) {
		registerPage.add_email_field_register(email);
		
	}

	@Step
	public void input_password_at_register_page(String password) {
		registerPage.add_password_field_register(password);		
	}

	@Step
	public void input_confirm_password_at_register_page(String password_confirm) {
		registerPage.add_password_confirm_field_register(password_confirm);
		
	}

	@Step
	public void input_address_at_register_page(String address) {
		registerPage.add_address_field_register(address);
		
	}

	@Step
	public void input_phone_at_register_page(String phone) {
		registerPage.add_phone_field_register(phone);
		
	}

	@Step
	public void input_name_at_register_page(String name) {
		registerPage.add_name_field_register(name);
		
	}
	

	
	
	
	
}