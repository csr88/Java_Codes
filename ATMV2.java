import java.util.Scanner;
public class ATMV2 {
    public static void main(String args[]) {
        int balance = 350000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin: ");
        int pin  = sc.nextInt();
        if (pin == 1234) {

            char ex;
            do {
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for EXIT");
                System.out.print("\nChoose the operation you want to perform:");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = sc.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Rs " + withdraw + " has been deducted from your bank account.");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Rs " + deposit + " has been successfully deposited");
                        System.out.println("You current balance is " + balance);
                        break;

                    case 3:
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);
                }

                System.out.println("\nDo you want to continue?(y/n)");
                ex = sc.next().charAt(0);
            } while (ex == 'y');
        }
        else{
            System.out.println("Invalid Pin.");
        }
    }
}

