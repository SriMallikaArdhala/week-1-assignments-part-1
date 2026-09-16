import java.util.*;
import static java.lang.System.out;

public class Assignment10Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int choice;

        do {
            out.println("\n1. Check Balance");
            out.println("2. Deposit Money");
            out.println("3. Withdraw Money");
            out.println("4. Exit");

            out.print("Enter the choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    out.println("Available balance: " + balance);
                    break;

                case 2:
                    out.print("Enter amount to be deposited: ");
                    int depositAmount = sc.nextInt();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        out.println(depositAmount + " deposited successfully");
                    } else {
                        out.println("Deposit amount must be positive");
                    }
                    break;

                case 3:
                    out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();

                    if (withdrawAmount <= 0) {
                        out.println("Withdrawal amount must be positive");
                    } else if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        out.println(withdrawAmount + " withdrawn successfully");
                    } else {
                        out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    out.println("Thank you!!");
                    break;

                default:
                    out.println("Invalid Menu choice");
            }

        } while (choice != 4);

        sc.close();
    }
}