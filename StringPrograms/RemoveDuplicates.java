package StringPrograms;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String")  ; 
        String s = sc.nextLine();
       char [] c = s.toCharArray();
       String newString = "";
        Set set = new LinkedHashSet<>();
        for(int i = 0;i<c.length;i++){
            set.add(c[i]);
        }
        for(Object o : set){
            newString = newString+o;

        }
        System.out.println(newString);
       

    }
}