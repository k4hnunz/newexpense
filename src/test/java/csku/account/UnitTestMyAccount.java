package csku.account;

import csku.MyAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitTestMyAccount {


    MyAccount account;

    @BeforeEach
    void init(){
        account=new MyAccount(1000.0,0.0);
    }

    @Test
    public void testCurrentIncome(){
        assertEquals(1000,account.getIncome());
    }

    @Test
    public void testCurrentExpense(){
        assertEquals(0,account.getExpense());
    }
    @Test
    public void testPayMoneyLessThanIncomeMethod(){
        account.addExpense(133);
        assertEquals(867,account.showMoney());
    }

    @Test
    public void testAddIncome(){
        account.addIncome(500);
        assertEquals(1500,account.showMoney());
    }
    @Test
    public void testCurrentExpenseAfterPayMoney(){
        account.addExpense(192);
        assertEquals(192,account.getExpense());
        account.addExpense(28);
        assertEquals(220,account.getExpense());
    }


}
