package LooseCoupling;

 class PaymentClass {
    Payment payment = new CardPay();
    void doPayment(int amt){
          payment.doPayment(amt);


    }
  
    
}
