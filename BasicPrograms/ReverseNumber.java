package BasicPrograms;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Reverse");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while(temp>0){
            count++;
           temp =  temp/10;
        }

        temp = n;
        int rev = 0;
        for(int i = 1;i<= count;i++)
        {
            int rem = temp%10;
            rev = rev *10+ rem;


            temp = temp/10;

        }
        System.out.println("Reverse of number is "+rev);
        
    }
    
}
