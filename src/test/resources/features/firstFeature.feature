@first_test
Feature: Submission Functionality

  Scenario: Fill the complicated page
    Given that I am on the complicated page
    When I fill all the fields required for the first submit
    Then I check the confirmation message