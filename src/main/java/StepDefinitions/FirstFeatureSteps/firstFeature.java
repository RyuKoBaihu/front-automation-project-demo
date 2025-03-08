package StepDefinitions.FirstFeatureSteps;

import Actions.AccessComplicatedPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstFeature {

        AccessComplicatedPageActions accessComplicatedPageActions = new AccessComplicatedPageActions();

        @Given("that I am on the complicated page")
        public void iAmOnTheComplicatedPage() {
          accessComplicatedPageActions.accessComplicatedPage();
        }

        @When("I fill all the fields required for the first submit")
        public void ifillAllTheFieldsRequiredForTheFirstSubmit() {

        }

        @Then("I check the confirmation message")
        public void iCheckTheConfirmationMessage() {

        }

}

