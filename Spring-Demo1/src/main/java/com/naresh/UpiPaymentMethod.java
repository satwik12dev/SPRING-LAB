package com.naresh;

public class UpiPaymentMethod extends PaymentMethod {

    @Override
    public void paymentSuccessful() {
        System.out.println("UPI METHOD CALLED");
    }
}
