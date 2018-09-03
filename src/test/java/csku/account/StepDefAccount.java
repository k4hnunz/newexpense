package csku.account;

import controller.Account;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefAccount {
    Account account;


    @Before
    public void init(){
        account=new Account(0,0);
    }

    @Given("a user has (.*) for income")
    public void a_user_has_for_income(double remainingIncome){
        account.addIncome(remainingIncome);
    }

    @When("I add income amount (.*)")
    public void i_add_income_amount(double remainingIncome){
        account.addIncome(remainingIncome);
    }

    @When("I pay a money amount (.*)")
    public void i_pay_a_money_amount(double newExpense){
        account.pay(newExpense);
    }

    @When("I want to check my current income that is (.*)")
    public void i_want_to_check_my_current_income_that_is(double remainingIncome){
        assertEquals(remainingIncome,account.getReamainingIncome());
    }

    @Then("I have income amount (.*)")
    public void i_have_income_amount(double remainingIncome){
        assertEquals(remainingIncome,account.getReamainingIncome());
    }

    @Then("my expense is (.*)")
    public void my_expense_is(double expense){
        assertEquals(expense,account.getExpense());
    }

    @Then("system shows my current income amount (.*)")
    public void system_shows_my_current_income_amount(double remainingIncome){
        assertEquals(remainingIncome,account.getReamainingIncome());
    }


    @Then("system shows my current expense amount (.*)")
    public void system_shows_my_current_expense_amount(double expense){
        assertEquals(expense,account.getExpense());
    }

}
