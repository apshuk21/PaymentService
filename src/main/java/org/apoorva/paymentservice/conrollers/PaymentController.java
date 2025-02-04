package org.apoorva.paymentservice.conrollers;

import lombok.RequiredArgsConstructor;
import org.apoorva.paymentservice.dtos.InitialPaymentDTO;
import org.apoorva.paymentservice.services.IPaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

    private final IPaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitialPaymentDTO initialPaymentDTO) {
        long amount = initialPaymentDTO.getAmount();
        String phoneNumber = initialPaymentDTO.getPhoneNumber();
        String customerName = initialPaymentDTO.getCustomerName();
        String customerEmail = initialPaymentDTO.getCustomerEmail();
        String orderId = initialPaymentDTO.getOrderId();

        return paymentService.getStandardPaymentLink(amount, orderId, phoneNumber, customerName, customerEmail);
    }
}
