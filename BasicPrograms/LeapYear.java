package BasicPrograms;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Leap Year");
        int n = sc.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println(n+" is leap year");
                }
                else
                {
                    System.out.println(n+" is not leap year");
                }

            }
            else{
                System.out.println(n+" is leap year");
            }

        }
        else{
            System.out.println(n + " is not Leap Year");
        }
        
    }
    
}
