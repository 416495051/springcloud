package cn.hs.provider.controller;

import cn.hs.provider.eneity.ItemDesc;
import cn.hs.provider.service.ItemDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("itemDesc")
public class ItemDescController {

	@Autowired
	private ItemDescService itemDescService;

	@GetMapping("itemDesc/{itemID}")
	public ItemDesc queryItemDescById(@PathVariable Long itemID){
		return itemDescService.queryItemDescById(itemID);
	}

	@PostMapping("add")
	public Integer insertItemDesc(@RequestBody ItemDesc itemDesc){

		return itemDescService.insertItemDesc(itemDesc);
	}

	@PutMapping("update")
	public Integer updateItemDesc(@RequestBody ItemDesc itemDesc){
		return itemDescService.updateItemDesc(itemDesc);
	}

	@DeleteMapping("delete/{itemID}")
	public Integer deleteItemDesc(@PathVariable("itemID") Long itemID){
		return itemDescService.deleteItemDesc(itemID);
	}
}
