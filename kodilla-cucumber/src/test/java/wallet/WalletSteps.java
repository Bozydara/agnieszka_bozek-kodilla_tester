package wallet;

import com.kodilla.wallet.CashSlot;
import com.kodilla.wallet.Cashier;
import com.kodilla.wallet.Wallet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance());
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @Given("I have deposited $20 in my wallet")
    public void i_have_deposited_$20_in_my_wallet() {
        wallet.deposit(20);
        assertEquals(20, wallet.getBalance());
    }

    @When("I request $40")
    public void i_request_$40() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 40);
    }

    @Then("$20 should be dispensed")
    public void $20_should_be_dispensed() {
        assertEquals(20, cashSlot.getContents());
    }

    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        assertEquals(0, wallet.getBalance());
    }

    @When("I request $100")
    public void i_request_$100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);
    }

    @Then("$0 should be dispensed")
    public void $0_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @Given("I have deposited $15 in my wallet")
    public void i_have_deposited_$15_in_my_wallet() {
        wallet.deposit(15);
        assertEquals(15, wallet.getBalance());
    }

    @When("I request $15")
    public void i_request_$15() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 15);
    }

    @Then("$15 should be dispensed")
    public void $15_should_be_dispensed() {
        assertEquals(15, cashSlot.getContents());
    }
}