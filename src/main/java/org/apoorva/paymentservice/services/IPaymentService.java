package org.apoorva.paymentservice.services;

public interface IPaymentService {

    String getStandardPaymentLink(Long amount, String orderId, String phoneNumber, String customerName, String customerEmail);
}
