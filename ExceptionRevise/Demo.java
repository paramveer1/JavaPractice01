package ExceptionRevise;
import java.util.Scanner;

public class Demo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

       
       
     
       
        try{
             int a = sc.nextInt();
        System.out.println(a);
          
        }
        catch(Exception e ){
            System.out.println(e);
            return ;

        }
        finally{
                    sc.close();
                    System.out.println("Resource closed ");


        }
        
   

       
       

    }
    
}
