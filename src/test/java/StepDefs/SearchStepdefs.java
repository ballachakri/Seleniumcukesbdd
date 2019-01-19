package StepDefs;

import Results.ResultsPage;
import Search_and_Utils.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepdefs {

    private SearchPage sPage=new SearchPage ();
    private ResultsPage rPage=new ResultsPage ();

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        String url=sPage.getCurrentURL ();
        assertThat( "User is on the Argos Home Page ",url.endsWith (".co.uk/"));
    }
    @When("^i search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct (String myproduct)  {
        sPage.choiceProduct (myproduct);
    }

    @Then("^I should see all the relevant products \"([^\"]*)\"$")
    public void iShouldSeeAllTheRelevantProducts (String expected) {
     String actualProduct=rPage.getSearchedItem ();

        assertThat ("",actualProduct.equalsIgnoreCase (expected));
    }
}
