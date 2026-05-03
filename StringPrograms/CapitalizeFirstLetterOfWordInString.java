package StringPrograms;

import java.util.Scanner;

public class CapitalizeFirstLetterOfWordInString {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";

        String stringArray[]= s.split(" ");
        for(int i = 0;i< stringArray.length;i++){
            char [] charArray = stringArray[i].toCharArray();
            for(int j = 0;j<charArray.length;j++){
                     if(j==0){
                    charArray[j]= (char)(charArray[j]-32);
                     }
                    //  System.out.println();
                    a = a + charArray[j] ;
            }
            a = a + " ";
           
        }
        System.out.println(a);
    }

    
}
