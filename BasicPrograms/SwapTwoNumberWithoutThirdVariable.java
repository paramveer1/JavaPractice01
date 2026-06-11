package BasicPrograms;
import java.util.Scanner;
public class SwapTwoNumberWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
                System.out.println("Enter Second Number");

        int b = sc.nextInt();
        a = a+b;
        b=a-b;
        a= a-b;
        System.out.println("A is "+a);
                System.out.println("B is "+b);


    }
    
}
