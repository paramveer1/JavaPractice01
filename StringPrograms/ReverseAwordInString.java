package StringPrograms;

public class ReverseAwordInString {
    public static void main(String[] args) {
        String s = "param is good boy";
       String [] stringArray =  s.split(" ");
       for(int i = 0;i< stringArray.length;i++){
        // if(stringArray[i].equals("good")){
        if(i==2){
           char [] charArray = stringArray[i].toCharArray();
            String rev = "";
            for(int j = 0;j<charArray.length;j++)
            { 
                rev =  charArray[j] + rev;

            }

            stringArray[i] = rev;
            

        }
        

       }
       for(String word : stringArray)
       System.out.print(word + " ");
    }
    
}
