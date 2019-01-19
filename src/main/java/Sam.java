import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sam {

    @FindBy(css = "#searchTerm")

    public static WebDriver d;

    public static void main (String[] args) {
        d=new FirefoxDriver ();
        d.get ("http://www.argos.co.uk/");


    }


    public void s()
    {


        WebElement stxt;
        PageFactory.initElements (d,this);
        //stxt.sendKeys ("nike");
    }
}
