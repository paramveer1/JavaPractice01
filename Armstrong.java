import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp >0){
            count++;
            temp = temp /10;
        }

        temp = n;
        int arm = 0;
        for(int i = 1;i<= count;i++){
            int rem = temp%10; //irfifrilk
            int mul = 1;
            for(int j = 1;j<= count;j++){
                mul = mul*rem;
            }
            arm = arm+mul;
            temp = temp/10;

        }
        if(n==arm){
            System.out.print(n + " is armstrong ");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
    
}
