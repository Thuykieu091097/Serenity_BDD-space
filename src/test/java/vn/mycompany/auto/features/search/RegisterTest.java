package vn.mycompany.auto.features.search;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.mycompany.auto.steps.serenity.UserSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest {

	public static final String NAME = "THUY KIEU";
	public static final String EMAIL = "thuykieu@gmail.com";
	public static final String PASSWORD = "thuykieu0910";
	public static final String CONFIRMPASSWORD = PASSWORD;
	public static final String CONFIRMPASSDIFFERENTPASS = "thuykieu09100";
	public static final String ADDRESS = "HÀ NỘI";
	public static final String PHONE = "0979339597";
	public static final String INPUT_FAIL = "01";

	@Managed()
	WebDriver webdriver;

	@Steps
	UserSteps anna;

	@Before
	public void access_register_page() {
		anna.is_the_home_page();
		anna.click_button_register_at_home_page();
	}

	@Test
	// Register with blank all fields
	public void register_with_blank_all_fields() {
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with blank name field
	public void register_with_blank_name_field() {
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with blank email field
	public void register_with_blank_email_field() {
		anna.input_name_at_register_page(NAME);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with blank password field
	public void register_with_blank_password_field() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with blank confirm password field
	public void register_with_blank_confirm_password_field() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();

	}

	@Test
	// Register with blank address field
	public void register_with_blank_address_field() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();

	}

	@Test
	// Register with blank phone field
	public void register_with_blank_phone_field() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with name field fail, < 3 character
	public void register_with_name_fail() {
		anna.input_name_at_register_page(INPUT_FAIL);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with password fail,
	public void register_with_password_fail() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(INPUT_FAIL);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with confirm password fail
	public void register_with_confirm_password_fail() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(INPUT_FAIL);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with address fail
	public void register_with_address_fail() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(INPUT_FAIL);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with phone fail
	public void register_with_phone_fail() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(INPUT_FAIL);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register with password and confirm password is not match
	public void register_with_password_and_confirm_password_is_not_match() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSDIFFERENTPASS);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

	@Test
	// Register success, input full fields correct
	public void register_success() {
		anna.input_name_at_register_page(NAME);
		anna.input_email_at_register_page(EMAIL);
		anna.input_password_at_register_page(PASSWORD);
		anna.input_confirm_password_at_register_page(CONFIRMPASSWORD);
		anna.input_address_at_register_page(ADDRESS);
		anna.input_phone_at_register_page(PHONE);
		anna.click_button_register_at_register_page();
	}

}
