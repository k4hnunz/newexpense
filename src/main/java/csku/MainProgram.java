package csku;

public class MainProgram {
    public static void main(String[] args) {
        MyAccount me = new MyAccount();
        me.addIncome(1000);
        System.out.println("My Current Money : "+me.showMoney());
        me.addExpense(450);
        System.out.println("My Current Money : "+me.showMoney());
        System.out.println("Summary Income : " + me.getIncome());
        System.out.println("Summary Expense : " +me.getExpense());

    }
}
