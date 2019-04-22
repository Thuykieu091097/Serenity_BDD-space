package vn.company.auto.steps.serenity;

import vn.company.auto.pages.SearchPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class SearchSteps {

    SearchPage searchPage;

    @Step
    public void enters(String keyword) {
        searchPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        searchPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(searchPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        searchPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}