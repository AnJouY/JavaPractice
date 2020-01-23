package bankAcct;

import java.util.Scanner;

public class bankProgram {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the number of your choice from the following:");
            System.out.println("1. View Account Information");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit the Program");
            String userInput = sc.next();
            System.out.println("Your input is: " + userInput);
            if ("1".equalsIgnoreCase(userInput)) {
                account.viewAccountInfo();
            }
            if ("2".equalsIgnoreCase(userInput)) {
                System.out.print("Please enter the amount you want to deposit: ");
                int depositFund = sc.nextInt();
                System.out.println("You have deposited $" + depositFund);
                account.depositFunds(depositFund);
            }
            if ("3".equalsIgnoreCase(userInput)) {
                System.out.print("Please enter the amount you want to deposit: ");
                int withdrawFund = sc.nextInt();
                System.out.println("You have withdrew $" + withdrawFund);
                account.withdrawFunds(withdrawFund);
            }
            if ("4".equalsIgnoreCase(userInput)) {
                System.exit(0);
            }
        }
    }
}
