import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("I want to praise u param .If u allow,Press Continue  else Stop");
         String user_input =  sc.nextLine();
       while(user_input.equals("continue"))
       {
        System.out.println("param u r handsome ");
        System.out.println("press continue or Stop");
         user_input =  sc.nextLine();
         sc.close();

       }
        
    }
    
}
