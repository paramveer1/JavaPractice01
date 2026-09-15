package LooseCoupling;

public class Upi implements Payment {
    public void doPayment(int amt){
        System.out.println(amt + " paid using upi");
    }
    
}
