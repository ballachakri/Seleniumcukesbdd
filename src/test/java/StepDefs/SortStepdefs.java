package StepDefs;

import Results.ResultsPage;
import Search_and_Utils.SearchPage;
import com.google.common.collect.Ordering;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class SortStepdefs {
    private SearchPage sPage=new SearchPage ();
    private ResultsPage rPage=new ResultsPage ();

    @And("^i sort the product by \"([^\"]*)\"$")
    public void iSortTheProductBy (String sortby)  {
        rPage.sortBy (sortby);
    }


    @Then("^i could see the all products in sorting order of Price\"([^\"]*)\"$")
    public void iCouldSeeTheAllProductsInSortingOrderOfPrice (boolean expected )  {

        List<Double> productPrice= rPage.getSortBy ();
        System.out.println (productPrice);
        boolean sorted= Ordering.natural ().isOrdered (productPrice);

       // assertThat(" items not in sorted  ",sorted,is(equalTo (true)));
        // int totalProductsDisplayed=productPrice.size ();

    }
}
