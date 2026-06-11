package BasicPrograms;
import java.util.Scanner;

public class SwapTwoNumberUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");

        int b = sc.nextInt();
        int c = 0;
        c=a;
        a=b;
        b=c;
        System.out.printf("After Swap,First number is %d \n Second number is : %d",a,b);


    }

}
