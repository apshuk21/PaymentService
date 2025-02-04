package org.apoorva.paymentservice.paymentgateways;

public interface IPaymentGateway {

    String createStandardPaymentLink(Long amount, String orderId, String phoneNumber, String customerName, String customerEmail);
}
