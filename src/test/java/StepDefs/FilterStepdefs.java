package StepDefs;

import Results.ResultsPage;
import Search_and_Utils.SearchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class FilterStepdefs
{
private SearchPage sPage=new SearchPage ();
private ResultsPage rPage=new ResultsPage ();

    @When("^i search for product \"([^\"]*)\"$")
    public void i_search_for_product(String item) {
       sPage.choiceProduct (item);
    }
    @When("^i selected review \"([^\"]*)\" on search results$")
    public void i_selected_review_on_search_results(String filterValue) {
        rPage.filterBy(filterValue);
    }
    @Then("^I should see all the relevant products \"([^\"]*)\" are filtered \"([^\"]*)\"$")
    public void i_should_see_all_the_relevant_products_are_filtered(String filter, String filterValue)  {
        if(filter.equalsIgnoreCase ("customerReview"))
        {
            List <Double> actualReview = rPage.getByReview ();
            assertThat ("Wrong values are stored", actualReview, everyItem (greaterThanOrEqualTo (5.0)));
        }
        if(filter.equalsIgnoreCase ("range"))
        {
            List <Double> priceDisplayed = rPage.getPriceRange ();
            System.out.println (priceDisplayed);
            List<String> priceRangeList= Arrays.asList (filterValue.split ("-"));
            System.out.println (priceRangeList);
//            Double minPrice=Double.parseDouble (priceRangeList.get (0));
//            Double maxPrice=Double.parseDouble (priceRangeList.get (1));
//          //  assertThat (priceDisplayed,everyItem (is(Matchers.both(greaterThanOrEqualTo (minPrice).and(lessThandOrEqualTo(maxPrice)))));
        }
    }



}
