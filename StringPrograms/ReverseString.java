
package StringPrograms;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter String to reverse");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        for(int i = s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        
    }
    
}
