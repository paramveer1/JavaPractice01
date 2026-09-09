package Demo;
// import java.util.Scanner;

 public class Demo{
  
    public static void main(String[] args) {
      Child p = new Child();
      p.marry();
      

      
    
       
       
    }
    
 }

 class Parent {
   int marry(){
    System.out.println("marry sheela");
    return 0;

  }
 }

 class Child extends  Parent{
 void show(){
  System.out.println("in child");
 }

 }