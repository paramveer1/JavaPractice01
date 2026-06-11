package BasicPrograms;
import java.util.Scanner;
public class PallindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number to check Pallindrome or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;

        while(temp>0){
            count++;
            temp = temp/10;
        }

        temp = n;
        int rev = 0;

        for(int i = 1;i<= count;i++){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;


        }

        if(rev==n){
            System.out.print(n+" is Pallindrome number");
        }
        else{
            System.out.println("Not pallindrome");
        }

        
    }
    
}
