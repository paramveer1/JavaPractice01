package StringPrograms;
import java.util.Scanner;


public class FindAllIndex {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Enter char whose all index you want to know");
        char letter = sc.next().charAt(0);
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==letter){
                System.out.print(i + "  ");

            }
        }


    }
    
}
