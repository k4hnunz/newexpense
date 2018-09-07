package csku;

/**
 * Created by 708 on 8/31/2018.
 */
public class MyAccount {
    private double income;
    private double expense;
    private double money;

    public MyAccount() {
    }

    public MyAccount(double income , double expense) {
        this.income = income;
        this.expense = expense;
        money = income - expense;
        //System.out.println("My New Income : "+ income + " || My New Expense : "+ expense +" || My Current Money : "+ money);
    }

    public double showMoney(){
        return money;
    }

    public void addIncome(double lastIncome){
        money += lastIncome;
        income += lastIncome;
    }

    public void addExpense(double lastExpense){
        money -= lastExpense;
        expense += lastExpense;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }
}
