package w3resource.inheritance;

public class BankAccount {
    private String accountNumber;
    private double balance;
    int amountDeposited;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance +=amount;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public int deposits(int amountDeposited){
        return amountDeposited;
    }
    public int withdrawal(int amountToWithdraw){
        return amountToWithdraw;
    }
}
