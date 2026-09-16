package LooseCoupling;

 class PaymentClass {
      Payment payment;
      PaymentClass(Payment payment){
            this.payment= payment;

      }
    
    void doPayment(int amt){
      
          payment.doPayment(amt);


    }
  
    
}
