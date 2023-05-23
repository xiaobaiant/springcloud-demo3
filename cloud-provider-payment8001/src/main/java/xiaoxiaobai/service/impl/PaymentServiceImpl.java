package xiaoxiaobai.service.impl;

import org.springframework.stereotype.Service;
import xiaoxiaobai.dao.PaymentDao;
import xiaoxiaobai.entities.Payment;
import xiaoxiaobai.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: hys
 * @createTime: 2023年05月23日 10:22:44
 * @version:
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}