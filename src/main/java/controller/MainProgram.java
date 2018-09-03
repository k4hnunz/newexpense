package controller;

public class MainProgram {
    public static void main(String[] args) {
        Account account=new Account(200,10);

        System.out.println(account.toString());
        account.pay(100);
        System.out.println(account.getReamainingIncome());
        account.addIncome(500);
        System.out.println(account.getReamainingIncome());
        System.out.println(account.getInitialIncome());
        System.out.println(account.getExpense());

    }
}
