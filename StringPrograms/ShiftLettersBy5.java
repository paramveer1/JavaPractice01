package StringPrograms;

public class ShiftLettersBy5 {
    public static void main(String[] args) {
        String s = "ajirngv";
       char [] charArray =  s.toCharArray();
       
       for(int i = 1;i< charArray.length;i++){
        System.out.print(charArray[i]+" ");
        // System.out.print(charArray[i+5] + " ");
       }
       System.out.println();
        for(int i = 1;i< charArray.length;i++){
        // System.out.print(charArray[i]);
        if(charArray[i]+5>122){
          
            System.out.print((char)(charArray[i] + 5 -26)+ " ");

        }
        else
        System.out.print((char)(charArray[i] + 5)+ " ");
       }
    }
    
}
