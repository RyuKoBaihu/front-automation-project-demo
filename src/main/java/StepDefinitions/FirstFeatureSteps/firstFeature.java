package StepDefinitions.FirstFeatureSteps;

import Actions.AccessComplicatedPageActions;
import Actions.SectionRandomStuffActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstFeature {

        SectionRandomStuffActions sectionRandomStuffActions = new SectionRandomStuffActions();
        AccessComplicatedPageActions accessComplicatedPageActions = new AccessComplicatedPageActions();

        @Given("that I am on the complicated page")
        public void iAmOnTheComplicatedPage() {
          accessComplicatedPageActions.accessComplicatedPage();
        }

        @When("I fill all the fields required for the first submit")
        public void ifillAllTheFieldsRequiredForTheFirstSubmit() {
          sectionRandomStuffActions.fillingSectionRandom();
        }

        @Then("I check the confirmation message")
        public void iCheckTheConfirmationMessage() {

        }

}

