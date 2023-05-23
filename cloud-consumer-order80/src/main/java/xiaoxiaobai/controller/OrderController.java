package xiaoxiaobai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xiaoxiaobai.common.CommonResult;
import xiaoxiaobai.entities.Payment;

import javax.annotation.Resource;

/**
 * @Author: hys
 * @createTime: 2023年05月23日 10:56:42
 * @version:
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {
    //请求地址
    public static final String PAYMENTSRV_URL = "http://localhost:8001";

    public static final String PAYMENT_SRV="http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")//客户端用的浏览器是get请求,但是底层实现使用的是post调用服务端8001
    public CommonResult create(Payment payment) {
        log.info("order80-------->重定向的端口1" + PAYMENT_SRV + "/payment/create");
        return restTemplate.postForObject(PAYMENT_SRV + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/" + id, CommonResult.class, id);
    }
}