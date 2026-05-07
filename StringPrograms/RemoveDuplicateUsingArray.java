package StringPrograms;
import java.util.Scanner;

public class RemoveDuplicateUsingArray {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] charArray = new char[s.length()];
        for(int i = 0;i<charArray.length;i++){
            charArray[i]= s.charAt(i);
        }
        String uniqueString = "";
        for(int i = 0;i<charArray.length;i++){
            int count = 0;
            for(int j = 0;j<i;j++){
                if(charArray[i]==charArray[j]){
                   count++;
                   break;
                }
               

                
               
            }
            if(count==0){
                uniqueString = uniqueString+ charArray[i];
            }
           

        }
        System.out.println(uniqueString);
        
    }
    
}
