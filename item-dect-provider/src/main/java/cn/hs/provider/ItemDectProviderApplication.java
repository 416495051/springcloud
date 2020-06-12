package cn.hs.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.hs.provider.mapper")
public class ItemDectProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemDectProviderApplication.class, args);
	}

}
