import java.util.Scanner;

public class BankingApplication {
    double accountBalance;


     void getMenu()
     {
                System.out.println("\n1.Check Account Balance \n2.Deposit Money \n3.Withdraw Money \n4.Exit  \n");
                Scanner sc = new Scanner(System.in);
                System.out.println("Insert Option :");
                int userInput = sc.nextInt();
                if(userInput==1)
        {
            getAccountBalance();

        }
                else if(userInput==2)
                {
                    depositMoney();
                }

                else if (userInput==3)
                {
                    withdrawMoney();
                }
                else if(userInput==4)
                {
                    getExit();
                }
                else{
                    System.out.println("Invalid Input");
                    getMenu();
                }

     }

       void getAccountBalance() {
        System.out.println("Account Balance is " + accountBalance);
        getContinueBankingWindow();

    }
     void depositMoney()
     {

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Amount to Deposit");
                Double moneyToAdd = sc.nextDouble();
                if(moneyToAdd<0)
                {
                    System.out.println("Invalid Amount ,Amount must be Positive");
                   depositMoney();
                   System.out.println("ok");
                }
                else{
                accountBalance=accountBalance+moneyToAdd;
                System.out.println("Money Deposited Successfully");
                getAccountBalance();
                  getContinueBankingWindow();
                }

     }


     void withdrawMoney()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw");
      Double moneyToWithdraw =   sc.nextDouble();
      if(moneyToWithdraw<=accountBalance && moneyToWithdraw>0)
      {
           accountBalance=accountBalance-moneyToWithdraw;
           System.out.println("Account Debited");
           getAccountBalance();

           
      }
      else if (moneyToWithdraw>accountBalance){
        System.out.println("Insufficient Fund in your account, Try Entering New Amount to withdraw");
        withdrawMoney();
      }
        else if(moneyToWithdraw==0)
        {
            System.out.println("Money to withdraw can't be zero ");
            withdrawMoney();
        }
        else{
            System.out.println("Money to withdraw can't be Negative ");
            withdrawMoney();
        }


        getContinueBankingWindow();
        
      }


     
  void getContinueBankingWindow()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n\nDo you still want to continue using our banking services ?\n1.Yes\n2.No\n");
    int userInput = sc.nextInt();
    if(userInput==1)
    {
        getMenu();
    }
    else if(userInput==2)
    {
        getExit();
    }
    else{
        System.out.println("Invalid Input");
        
    }
  }

  void getExit()
  {
    System.out.println("Thanks for using our Banking Services,Come Soon");
  }



    

    public static void main(String[] args) {
      
        Banking banking = new Banking();
        System.out.println("Welcome to Our Banking Services\n");
        banking.getMenu();
        
    }

}
