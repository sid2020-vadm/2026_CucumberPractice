package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentTest {
    @Given("I logged into homepage")
    public void i_logged_into_homepage() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("### I logged into homepage ###");
    }
    @When("I perform UPI payment")
    public void i_perform_upi_payment() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("### I perform UPI payment ###");
    }
    @Then("payment should be successful")
    public void payment_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("### payment should be successful ###");
    }
}
