package org.apoorva.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitialPaymentDTO {
    long amount;
    String orderId;
    String phoneNumber;
    String customerName;
    String customerEmail;
}
