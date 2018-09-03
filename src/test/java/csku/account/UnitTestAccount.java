package csku.account;

import controller.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitTestAccount {


    Account account;

    @BeforeEach
    void init(){
        account=new Account(1000.0,0.0);
    }

    @Test
    public void testCurrentIncome(){
        assertEquals(1000,account.getInitialIncome());
    }

    @Test
    public void testCurrentExpense(){
        assertEquals(0,account.getExpense());
    }
    @Test
    public void testPayMoneyLessThanIncomeMethod(){
        account.pay(100);
        assertEquals(900,account.getReamainingIncome());
    }

    @Test
    public void testPayMoneyGreaterThanIncomeMethod(){
        account.pay(1100);
        assertEquals(1100,account.getExpense());
        assertEquals(0,account.getReamainingIncome());
    }
    @Test
    public void testAddIncomeMethod(){
        account.addIncome(55);
        assertEquals(1055,account.getReamainingIncome());
    }
    @Test
    public void testCurrentExpenseAfterPayMoney(){
        account.pay(100);
        assertEquals(100,account.getExpense());
        account.pay(50);
        assertEquals(150,account.getExpense());
    }


}
