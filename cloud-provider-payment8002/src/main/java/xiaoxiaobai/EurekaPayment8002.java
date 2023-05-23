package xiaoxiaobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hys
 * @createTime: 2023年05月23日 11:59:03
 * @version:
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaPayment8002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPayment8002.class,args);
    }
}