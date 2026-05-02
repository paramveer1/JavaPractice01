package StringPrograms;
import java.util.Scanner;

public class ShiftLetterByGivenNo{
    public static void main(String [] args){
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Enter number to shift");
        int shift = sc.nextInt();
        char [] charArray = s.toCharArray();
        for(int i = 0;i<charArray.length;i++){
            if(charArray[i]+shift >'z'){
                System.out.print((char)(charArray[i]+shift-26)+ " ");

            }
            else{
                System.out.print( (char)(charArray[i]+shift )+ " ");
            }
          
        }


        
    }
}