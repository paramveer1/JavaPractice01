package BasicPrograms;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println(" Calculator in ON \n Choose Operation to perform \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Divison \n 5.Modulus");
      Scanner sc = new Scanner(System.in);
    //   char c =  sc.next().charAt(0);
    int c = sc.nextInt();
        System.out.println("Enter First Number");
        
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        switch( c){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default:System.out.println("Invalid Input");

        }

        
    }
    
}
