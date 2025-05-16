package wallet;

import com.kodilla.wallet.CashSlot;
import com.kodilla.wallet.Cashier;
import com.kodilla.wallet.Wallet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance());
    }

    @When("I request $30")
    public void i_request_$30() {
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @And("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        assertEquals(170, wallet.getBalance());
    }

    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        assertEquals(100, wallet.getBalance());
    }

    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        assertEquals(100, wallet.getBalance());
    }

    @When("I withdraw $200")
    public void i_withdraw_$200() {
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @And("I should be informed {string}")
    public void i_should_be_informed_that_i_dont_have_enough_money_in_my_wallet(String message) {
        assertEquals("You don't have enough money in your wallet!", message);
    }

    @Given("I check the balance")
    public void i_check_the_balance() {
        assertEquals(0, wallet.getBalance());
    }

    @When("I deposit CHF 500 in my wallet")
    public void i_deposit_CHF_500_in_my_wallet() {
        wallet.checkCurrency("CHF");
    }

    @Then("nothing should be deposited")
    public void nothing_should_be_deposited() {

        assertEquals(0, wallet.getBalance());
    }

    @And("I should be noticed {string}")
    public void i_should_be_noticed(String message) {
        assertEquals("Unfortunately, you cannot deposit money in this currency!", message);
    }
}