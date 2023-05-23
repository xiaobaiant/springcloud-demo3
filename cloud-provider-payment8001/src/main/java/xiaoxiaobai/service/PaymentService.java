package xiaoxiaobai.service;

import org.apache.ibatis.annotations.Param;
import xiaoxiaobai.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
