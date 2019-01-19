package StepDefs;

import Register.Registration;
import Search_and_Utils.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class RegisterStepdefs
    {
        private Registration register=new Registration ();
        private SearchPage sPage=new SearchPage ();


        @When("^i will navigate register page$")
        public void iWillNavigateRegisterPage ( )
        {
        register.cLogin ();

        }

        @And("^i will enter the user deatils:$")
        public void iWillEnterTheUserDeatils ( )
        {

        }
    }
