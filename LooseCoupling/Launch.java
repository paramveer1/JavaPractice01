package LooseCoupling;

public class Launch {
    public static  void main(String args[]){
        PaymentClass payment = new PaymentClass(new Upi());
        payment.doPayment(100);



        


    }

   
    
}
