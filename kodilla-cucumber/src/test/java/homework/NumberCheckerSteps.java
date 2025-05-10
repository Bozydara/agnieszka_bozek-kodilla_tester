package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.kodilla.homework.NumberChecker.divideNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberCheckerSteps {
    int number;
    String text;

    @Given("the number is 3")
    public void the_number_is_3() {
        this.number = 3;
    }

    @Given("the number is 5")
    public void the_number_is_5() {
        this.number = 5;
    }

    @Given("the number is 15")
    public void the_number_is_15() {
        this.number = 15;
    }

    @Given("the number is 0")
    public void the_number_is_0() {
        this.number = 0;
    }

    @Given("the number is 20")
    public void the_number_is_20() {
        this.number = 20;
    }

    @Given("the number is -5")
    public void the_number_is_minus_5() {
        this.number = -5;
    }

    @Given("the number is 4")
    public void the_number_is_4() {
        this.number = 4;
    }

    @Given("the number is 12")
    public void the_number_is_12() {
        this.number = 12;
    }

    @Given("the number is 44")
    public void the_number_is_44() {
        this.number = 44;
    }

    @When("I divide it by 3 and 5")
    public void i_divide_it_by_3_and_5() {
        this.text = divideNumber(this.number);
    }

    @Then("I should receive {string}")
    public void i_should_receive(String string) {
        assertEquals(string, this.text);
    }
}