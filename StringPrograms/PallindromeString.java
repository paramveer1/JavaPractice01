package StringPrograms;
import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check Pallindrome");
        String s = sc.nextLine();
        String rev = "";
        for(int i = s.length()-1;i>= 0;i-- ){
            rev = rev+s.charAt(i);


        }
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println(s+" is Pallindrome");
        }
        else{
            System.out.println(s+" is not pallindrome");
        }

        
    }
    
}
