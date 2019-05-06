package vn.mycompany.auto.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://localhost:8000")
public class HomePage extends PageObject {

	private static final String BUTTON_LOGIN_HOME = ".col-sm-6 > a:nth-child(1)";
	private static final String BUTTON_REGISTER_HOME = ".col-xs-12 > a:nth-child(2)";
	
	public void click_button_login_at_home_page() {
		$(BUTTON_LOGIN_HOME).click();
	}
	
	public void click_button_register_at_home_page() {
		$(BUTTON_REGISTER_HOME).click();
	}
	
	@FindBy(name = "search")
	private WebElementFacade searchTerms;

	@FindBy(css=".fa-search")
	private WebElementFacade lookupButton;

	public void enter_keywords(String keyword) {
		searchTerms.type(keyword);
	}

	public void lookup_terms() {
		lookupButton.click();
	}

	public List<String> getDefinitions() {
		WebElementFacade definitionList = find(By.tagName("ol"));
		return definitionList.findElements(By.tagName("li")).stream().map(element -> element.getText())
				.collect(Collectors.toList());
	}
}