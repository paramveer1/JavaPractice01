package Pattern;

import java.util.Scanner;
public class SquareFill {
    public static void main(String[] args) {
        System.out.println("Enter Length of Square");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<= n;i++){
            for(int j = 1;j<= n;j++){
                if(i==1||j==1||i==n||j==n || i==j || i+j==6)
                System.out.print(j+" ");
            else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
    
}
