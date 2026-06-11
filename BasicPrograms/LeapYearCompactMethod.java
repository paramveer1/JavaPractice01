package BasicPrograms;
import java .util. Scanner ; 

// 2400  and 2800
public class LeapYearCompactMethod {
    public static void main(String[] args) {
        System.out.println("Enter number to check Leap Year");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%400==0||n%4==0 && n%100 != 0)
        {
            System.out.println(n+" is Leap Year");
        }
        else
        {
            System.out.print(n +" is not Leap Year");
        }
        
    }
    
}
