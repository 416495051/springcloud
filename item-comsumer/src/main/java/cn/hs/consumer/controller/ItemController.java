package cn.hs.consumer.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.hs.consumer.cilent.ItemCilent;
import cn.hs.consumer.cilent.ItemDescCilent;
import cn.hs.consumer.eneity.Item;
import cn.hs.consumer.eneity.ItemDesc;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("consumer/item")
public class ItemController {
	@Autowired
	private ItemCilent itemCilent;

	@Autowired
	private ItemDescCilent itemDescCilent;

	@GetMapping("{id}")
	public List getItemByID(@PathVariable("id") Long id){
		List<Object> list = new ArrayList<>();
		Item item = this.itemCilent.getItemById(id);
		list.add(item);
		list.add(this.itemDescCilent.queryItemDescById(item.getId()));
		return list;
	}

	@PostMapping("insertItem")
	public Integer insertItem(@RequestBody String jsonRequest){
		JSONObject jsonObject = JSONObject.parseObject(jsonRequest);
		Map<String, Object> map =jsonObject;
		String item = map.get("item").toString();
		String itemDesc  = map.get("itemDesc").toString();
		List<Item> list1 = JSONObject.parseArray(item,Item.class);
		List<ItemDesc> list2 = JSONObject.parseArray(itemDesc,ItemDesc.class);
		Item item1 = list1.get(0);
		Long i = this.itemCilent.insertItem(item1);
		ItemDesc itemDesc1 = list2.get(0);
		itemDesc1.setItemID(i);
		Integer integer = this.itemDescCilent.insertItem(itemDesc1);
		return integer;
	}

	@PutMapping("updateItem")
	public Integer updateItem(@RequestBody String jsonRequest){
		JSONObject jsonObject = JSONObject.parseObject(jsonRequest);
		Map<String, Object> map =jsonObject;
		String item = map.get("item").toString();
		String itemDesc  = map.get("itemDesc").toString();
		List<Item> list1 = JSONObject.parseArray(item,Item.class);
		List<ItemDesc> list2 = JSONObject.parseArray(itemDesc,ItemDesc.class);
		Item item1 = list1.get(0);
		ItemDesc itemDesc1 = list2.get(0);
		Integer i1 = this.itemCilent.updateItem(item1);
		Integer i2 = this.itemDescCilent.updateItemDesc(itemDesc1);
		return i1+i2;
	}

	@DeleteMapping("delete/{id}")
	public Integer deleteItme(@PathVariable("id") Long id){
		Integer i1 = this.itemCilent.deleteItem(id);
		Integer i2 = this.itemDescCilent.deleteItemDesc(id);
		return i1+i2;
	}

}
