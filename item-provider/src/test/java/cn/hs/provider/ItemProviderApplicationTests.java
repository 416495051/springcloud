package cn.hs.provider;

import cn.hs.provider.eneity.Item;
import cn.hs.provider.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootTest
class ItemProviderApplicationTests {

	@Autowired
	private ItemService itemService;
	@Test
	void contextLoads() {
	}


	@Test
	void insertItem(){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Item item = new Item();
		item.setTitle("456465");
		item.setPrice(5000L);
		item.setNum(20);
		item.setCid(2L);
		item.setStatus(1);
		try {
			item.setCreated(df.parse("2010-09-13 22:36:01"));
			item.setUpdated(df.parse("2010-09-13 22:36:01"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		itemService.insertItem(item);
	}
}
