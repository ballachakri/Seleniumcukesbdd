package StepDefs;

import Results.ResultsPage;
import ShoppingResults.ShoppingResults;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShoppingBasketMyStepdefs
    {
   private ResultsPage rpage=new ResultsPage ();
   private ShoppingResults sPage=new ShoppingResults ();
    @And("^i select a product randomly$"  )
    public void iSelectAProductRandomly ()
        {
     rpage.selectRandomProduct ();

        }

    @And("^the product should be added to basket$")
    public void theProductShouldBeAddedToBasket ( ) {
    sPage.goToTrolley ();

    }

    @And("^i will go to basket$")
    public void iWillGoToBasket ( )  {
    sPage.getItemsFromBasket ();
    }

    @Then("^i should see the product my basket to buy it$")
    public void iShouldSeeTheProductMyBasketToBuyIt ( )  {
    sPage.chooseStore ();
    }
}
