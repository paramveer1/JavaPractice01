package ExceptionRevise.CustomException;
import java.util.Scanner;
public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age< 18)
        throw new AgeNotEligible("Age is less than 18");
    else
    {
        System.out.println("Eligible for voting");
    }
        
    }
    
}
