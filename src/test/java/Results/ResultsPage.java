package Results;

import DriverHelper.DriverHelper;
import Search_and_Utils.RandomNumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverHelper {

    @FindBy(css = ".font-condensed.search-title__term")
    private WebElement displayedProduct;
    @FindBy(css = ".ac-facet__label")
    private List <WebElement> reviewFilter;
    @FindBy(css = ".ac-star-rating")
    private List <WebElement> starRating;
    @FindBy(css = ".ac-product-price__amount")
    private List <WebElement> filterAmount;
    @FindBy(css = ".font-standard.form-control.sort-select")
    private WebElement dropDown;
    @FindBy(css = ".ac-product-card__name")
    private List <WebElement> productCard;

    public String getSearchedItem ( ) {
        String item = displayedProduct.getText ();
        return item;
    }
    public void filterBy (String reviewChoice) {
        List <WebElement> eleList = reviewFilter;
        for (WebElement rl : eleList) {
            if (rl.getText ().equalsIgnoreCase (reviewChoice)) {
                rl.click ();
                break;
            }
        }
    }
    public List <Double> getByReview ( ) {
        List <Double> reviewListDisplayed = new ArrayList <> ();
        List <WebElement> eleList = starRating;
        for (WebElement rl : eleList) {
            String reviewValueString = rl.getAttribute ("data-star-rating");
            double reviewValueDouble = Double.parseDouble (reviewValueString);
            reviewListDisplayed.add (reviewValueDouble);
        }
        return reviewListDisplayed;
    }
    public List <Double> getPriceRange ( ) {
        List <Double> priceListDisplayed = new ArrayList <> ();
        List <WebElement> eleList = filterAmount;
        for (WebElement rl : eleList) {
            String reviewValueString = rl.getAttribute (".ac-star-rating");
            System.out.println (rl.getText ());
            double getPriceList = Double.parseDouble (rl.getText ().replace ("£", ""));
            priceListDisplayed.add (getPriceList);
        }
        return priceListDisplayed;
    }
    public void sortBy (String choice) {
        Select allDropDownList = new Select (dropDown);
        allDropDownList.selectByVisibleText (choice);
    }
    public List <Double> getSortBy ( ) {
        List <Double> priceList = new ArrayList <> ();
        List <WebElement> eleList = filterAmount;
        for (WebElement rl : eleList) {
           String reviewValueString = rl.getAttribute (".ac-star-rating");
           double getPriceList = Double.parseDouble (rl.getText ().replace ("£", ""));
           priceList.add (getPriceList);
        }
        return priceList;
    }
    public String selectRandomProduct ( ) {
        List <WebElement> eleList = productCard;
        int productsDisplayed = eleList.size ();
        System.out.println ("Total number of products displayed to choose randomly  :" + productsDisplayed);
        RandomNumber rndNumber = new RandomNumber ();
        int random = rndNumber.randomNumberGenerated (productsDisplayed);
        WebElement randomProduct = eleList.get (random);
        String chooseProduct = randomProduct.getText ();
        randomProduct.click ();
        System.out.println ("The random Product :   " + chooseProduct);
        return chooseProduct;
    }
}



