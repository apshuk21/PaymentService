package org.apoorva.paymentservice.services;

import org.apoorva.paymentservice.paymentgateways.IPaymentGateway;
import org.apoorva.paymentservice.paymentgateways.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayService implements IPaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    @Override
    public String getStandardPaymentLink(Long amount, String orderId, String phoneNumber, String customerName, String customerEmail) {
        IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getPaymentGateway();
        return paymentGateway.createStandardPaymentLink(amount, orderId, phoneNumber, customerName, customerEmail);
    }
}
