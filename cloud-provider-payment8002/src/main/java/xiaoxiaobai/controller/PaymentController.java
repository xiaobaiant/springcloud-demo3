package xiaoxiaobai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import xiaoxiaobai.common.CommonResult;
import xiaoxiaobai.entities.Payment;
import xiaoxiaobai.service.PaymentService;
import javax.annotation.Resource;

/**
 * @Author: hys
 * @createTime: 2023年05月23日 11:44:20
 * @version:
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if(i>0){
            return new CommonResult(200,"数据创建成功,",null);
        }else{
            return new CommonResult(444,"数据创建失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:  " + payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id);
        }
    }

}