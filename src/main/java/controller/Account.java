package controller;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 708 on 8/31/2018.
 */
public class Account {
    private double initialIncome;
    private double reamainingIncome;
    private double expense;

    public Account(double income, double expense) {
        this.initialIncome = income;
        this.reamainingIncome=initialIncome-expense;
        this.expense = expense;
    }

    public void addIncome(double newIncome){
        reamainingIncome+=newIncome;
    }

    public void pay(double newExpense){
        if(newExpense>=reamainingIncome){
            reamainingIncome=0;
            expense+=newExpense;
        }
        else{
            expense+=newExpense;
            reamainingIncome-=newExpense;
        }

    }

    public String toString() {
        return "Initial income = " + initialIncome + " ## Expense = " + expense+" ## Reamaining income = " + reamainingIncome ;
    }

    public double getInitialIncome() {
        return initialIncome;
    }

    public double getReamainingIncome() {
        return reamainingIncome;
    }

    public double getExpense() {
        return expense;
    }
}
