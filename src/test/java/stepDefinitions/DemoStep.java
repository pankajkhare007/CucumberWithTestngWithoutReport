package stepDefinitions;

import asserts.Assertions;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.qameta.allure.Step;

public class DemoStep {

    private Scenario scenario;
    @Before
    public void before(Scenario scenario) {

        this.scenario =scenario;
       String str= scenario.getName();

    }
    @Step("Step Enter username")
    @Given("^Enter username \"([^\"]*)\"$")
    public void enter_username(String username) throws Throwable {
        System.out.println(username);

    }

    @And("^Enter Password$")
    public void enter_Password() throws Throwable {
        System.out.println("Enter password");

    }

    @And("^Verify validation message$")
    public void verifyValidationMessage() throws Throwable {
        Assertions.expectedTextsAreEqual("successful message","contact not added successfully","contact added successfully");

    }

    @And("^Enter Username")
    public void enter_Username() throws Throwable {
        System.out.println("Enter Username of Demo2");

    }

    @And("Navigate to client detail page")
    public void Navigatetoclientdetailpage()
    {
        System.out.println("Navigatetoclientdetailpage in demo2");
    }

}
