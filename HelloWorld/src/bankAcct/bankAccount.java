package bankAcct;

public class bankAccount {
    public int accountNumber = 123456789;
    public double balance = 50.0;
    public String customerName = "Angel";
    public String email = "angelyang93@gmail.com";
    public String phoneNumber = "8017917298";

    public void depositFunds(double amountIn) {
        balance = balance + amountIn;
        System.out.println("The current balance for " + customerName + " is " + balance);
    }

    public void withdrawFunds(double amountOut) {
        if (amountOut <= balance) {
            balance = balance - amountOut;
        } else {
            System.out.println("You don't have enough funds.");
        }
        System.out.println("The current balance for " + customerName + " is " + balance);
    }

    public void viewAccountInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: "+ phoneNumber);
    }
}
