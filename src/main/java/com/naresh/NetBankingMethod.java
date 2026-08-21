package com.naresh;

public class NetBankingMethod extends PaymentMethod{

        @Override
        public void paymentSuccessful() {
            System.out.println("Netbanking METHOD CALLED");
        }
}
