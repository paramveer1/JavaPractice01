import java.util.Scanner;

public class BankingApplication {
    double accountBalance;

    void getMenu() {
        System.out.println("\n1.Check Account Balance \n2.Deposit Money \n3.Withdraw Money \n4.Exit  \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Option :");
        int userInput = sc.nextInt();
        if (userInput == 1) {
            getAccountBalance();

        } else if (userInput == 2) {
            System.out.println("Enter Amount to Deposit");
            double moneyToAdd = sc.nextDouble();
            depositMoney(moneyToAdd);
        }

        else if (userInput == 3)

        {
            System.out.println("Enter Amount to Withdraw");
            double moneyToWithdraw = sc.nextDouble();
            withdrawMoney(moneyToWithdraw);
        } else if (userInput == 4) {
            getExit();
        } else {
            System.out.println("Invalid Input");
            getMenu();
        }
        sc.close();

    }

    void getAccountBalance() {
        System.out.println("Account Balance is " + accountBalance);
        getContinueBankingWindow();

    }

    void depositMoney(double moneyToAdd) {

        if (moneyToAdd < 0) {
            System.out.println("Invalid Amount ,Amount must be Positive");
            depositMoney(moneyToAdd);

        } else {
            accountBalance = accountBalance + moneyToAdd;
            System.out.println("Money Deposited Successfully");

            getContinueBankingWindow();

        }

    }

    void withdrawMoney(double moneyToWithdraw) {

        if (moneyToWithdraw <= accountBalance && moneyToWithdraw > 0) {
            accountBalance = accountBalance - moneyToWithdraw;
            System.out.println("Account Debited");
            getAccountBalance();

        } else if (moneyToWithdraw > accountBalance) {
            System.out.println("Insufficient Funds in your account");
            getContinueBankingWindow();
        } else if (moneyToWithdraw == 0) {
            System.out.println("Money to withdraw can't be zero ");
            withdrawMoney(moneyToWithdraw);
        } else {
            System.out.println("Money to withdraw can't be Negative ");
            withdrawMoney(moneyToWithdraw);
        }

        
    }

    void getContinueBankingWindow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nDo you still want to continue using our banking services ?\n1.Yes\n2.No\n");
        int userInput = sc.nextInt();
        if (userInput == 1) {
            getMenu();
        } else if (userInput == 2) {
            getExit();
        } else {
            System.out.println("Invalid Input");
            getContinueBankingWindow();

        }
        sc.close();
        
    }

    void getExit() {
        System.out.println("Thanks for using our Banking Services,Come Soon");
    }

    public static void main(String[] args) {
       
        BankingApplication banking = new BankingApplication();
        System.out.println("Welcome to Our Banking Services\n");
        banking.getMenu();

    }

}
