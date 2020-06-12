package cn.hs.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients //开启feign客户端
public class ItemComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemComsumerApplication.class, args);
	}

}
