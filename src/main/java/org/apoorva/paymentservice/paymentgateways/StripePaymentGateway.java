package org.apoorva.paymentservice.paymentgateways;

import org.springframework.stereotype.Component;

@Component(value = "StripePaymentGateway")
public class StripePaymentGateway implements IPaymentGateway{
    @Override
    public String createStandardPaymentLink(Long amount, String orderId, String phoneNumber, String customerName, String customerEmail) {
        return "";
    }
}
