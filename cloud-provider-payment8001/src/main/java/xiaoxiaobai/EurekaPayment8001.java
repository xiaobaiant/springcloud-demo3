package xiaoxiaobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hys
 * @createTime: 2023年05月23日 10:33:45
 * @version:
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class EurekaPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPayment8001.class,args);
    }
}