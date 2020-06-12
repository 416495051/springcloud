package cn.hs.consumer.cilent;

import cn.hs.consumer.eneity.ItemDesc;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-item-desc-provider")
public interface ItemDescCilent {
	@GetMapping("itemDesc/itemDesc/{itemID}")
	ItemDesc queryItemDescById(@PathVariable("itemID") Long itemID);

	@PostMapping("itemDesc/add")
	Integer insertItem(@RequestBody ItemDesc itemDesc);

	@PutMapping("itemDesc/update")
	Integer updateItemDesc(@RequestBody ItemDesc itemDesc);

	@DeleteMapping("itemDesc/delete/{itemID}")
	Integer deleteItemDesc(@PathVariable("itemID") Long itemID);
}
