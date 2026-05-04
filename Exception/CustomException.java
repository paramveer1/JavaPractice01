package Exception;

import java.util.Scanner;

class InvalidAge extends RuntimeException{
    public InvalidAge(String msg){
        super(msg);
    }
}

public class CustomException {
    public static void main (String [] args) throws InvalidAge {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
           throw new InvalidAge("Age is less than 18 ,you cant vote");
           
        }
        else
            System.out.println("You can vote");
        

        

      



    }
    
}
