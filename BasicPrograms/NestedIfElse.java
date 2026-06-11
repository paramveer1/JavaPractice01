package BasicPrograms;
import java .util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        System.out.println("Welcome to Admissions in Girls school \nPlease Enter Your Details");
        System.out.println("1.Enter your Percentage ");
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        System.out.println("Enter Your Gender m/f ");
        char gender =  sc.next().charAt(0);
        System.out.println("Enter Income of your father");
        int income = sc.nextInt();
        if(percentage>50){
            if(income>50000){
                if(gender == 'f'|| gender == 'F'){
                    System.out.println("Congo! You are Eligible");
                }
                else{
                System.out.println("Not  : Only girls allowed");
                }
            }
            else{

                if(gender!= 'f' || gender != 'F')
                System.out.println("Not Eligible : Income is low also only girls allowed");
            }

        }
        else{
            if(income<50000 && (gender != 'F' || gender != 'f') )
            {
                System.out.println( " percentage is low , Income is less , only Girls allowed here");
                return;

            }
            if(income<50000){
            System.out.println("Not Eligible : Percentage and Income are low ");
            return;
        }
        if(gender != 'F' || gender != 'f'){
            System.out.println("Not Eligible : Percentage and gender is not appropriate");
            return;
        }
      System.out.println("Percentage is low");


    }
    
}
}
