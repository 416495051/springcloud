package cn.hs.provider.controller;

import cn.hs.provider.eneity.Item;
import cn.hs.provider.service.ItemService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("itemId/{id}")
	public Item queryItemById(@PathVariable Long id){

		return itemService.queryItemById(id);
	}

	@PostMapping("insertItem")
	public Long insertItem(@RequestBody Item item) {

		return itemService.insertItem(item);
	}

	@PutMapping("updateItem")
	public Integer updateItem(@RequestBody Item item){
		return itemService.updateItem(item);
	}

	@DeleteMapping("deleteItem/{id}")
	public Integer deleteItem(@PathVariable("id") Long id){
		return itemService.deleteItem(id);
	}

}
