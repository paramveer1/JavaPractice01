package Practice2;
import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check Armstrong");
       int n =  sc.nextInt();
       int temp = n;
       int arm = 0;
        while ( temp>0) {
            count++;
            temp = temp/10;
            
        }
        temp = n;

       while(temp>0){
        int rem = temp%10;
        int mul = 1;
        for(int i = 1;i<=count;i++){
            mul = mul * rem;

        }
        arm = arm+mul;
        temp = temp/10;


       }
       if(n == arm){
        System.out.println("Armstrong");
       }
       else
       {
        System.out.println("Not Armstrong");
       }
    }
    
}
