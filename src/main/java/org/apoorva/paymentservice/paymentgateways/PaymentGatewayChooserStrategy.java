package org.apoorva.paymentservice.paymentgateways;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class PaymentGatewayChooserStrategy {

    private final IPaymentGateway paymentGateway;

    public PaymentGatewayChooserStrategy(@Qualifier("RazorpayPaymentGateway") IPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

}
