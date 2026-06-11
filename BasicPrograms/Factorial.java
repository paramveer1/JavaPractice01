package BasicPrograms;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number for factorial");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Factorial of negative number not defined");
            return;
        }
        if(a>20)
        {
            System.out.println("number too large for factorial");
            return;
        }
        long fact = 1;
        for(int i = 1;i<=a;i++){
           fact =  fact*i;

        }
        System.out.println(fact);
        
    }
    
}
