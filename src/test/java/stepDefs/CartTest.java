package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartTest {
    @Given("I am in cartpage")
    public void i_am_in_cartpage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("###I am in cart page###");
        System.out.println("###I am in new page###");
    }
    @When("add product to cart")
    public void add_product_to_cart() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        System.out.println("###add product to cart###");
    }

    @Then("added products can be checked out successfully")
    public void added_products_can_be_checked_out_successfully() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("###added products can be checked out successfully###");
    }
}
