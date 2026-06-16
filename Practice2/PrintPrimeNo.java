package Practice2;
import java.util.Scanner;


public class PrintPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no upto which prime number will be printed");
        int n = sc.nextInt();
        int primecount = 0;
        for(int i = 1;i<= n;i++){
            int count = 0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                primecount++;
                System.out.println(i);
               
            }
        }
         System.out.println("Total number of Prime Number : "+ primecount);
    }
    
}
