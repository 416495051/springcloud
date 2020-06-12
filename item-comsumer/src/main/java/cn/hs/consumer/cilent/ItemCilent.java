package cn.hs.consumer.cilent;

import cn.hs.consumer.eneity.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-item-provider")
public interface ItemCilent {
	@GetMapping("item/itemId/{id}")
	Item getItemById(@PathVariable("id") Long id);

	@PostMapping("item/insertItem")
	Long insertItem(@RequestBody Item item);

	@PutMapping("item/updateItem")
	Integer updateItem(@RequestBody Item item);

	@DeleteMapping("item/deleteItem/{id}")
	Integer deleteItem(@PathVariable("id") Long id);
}
