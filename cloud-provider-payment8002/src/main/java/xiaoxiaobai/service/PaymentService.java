package xiaoxiaobai.service;

import xiaoxiaobai.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
