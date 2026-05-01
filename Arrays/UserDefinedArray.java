package Arrays;

import java.util.Scanner;

public class UserDefinedArray {
    public static void main(String[] args) {
        System.out.println("Enter size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            System.out.print("Enter arr["+i+"] = ");
           arr[i]= sc.nextInt();
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
    
}
