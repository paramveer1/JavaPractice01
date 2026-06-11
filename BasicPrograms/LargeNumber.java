package BasicPrograms;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = 0;
        
        int b =0; 
        try {
          a=  sc.nextInt();

            System.out.println("Enter Second number");
          b=  sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("You entered wrong input");
            return;
           
        }
        if (a > b) {
            System.out.println(a + " is bigger");

        } else {
            System.out.println(b + " is bigger");
        }

    }

}
