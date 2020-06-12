package cn.hs.provider.service;

import cn.hs.provider.eneity.ItemDesc;
import cn.hs.provider.mapper.ItemDecsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDescService {
	@Autowired
	private ItemDecsMapper itemDecsMapper;

	public ItemDesc queryItemDescById(Long itemID){
		return itemDecsMapper.queryItemDescById(itemID);
	}

	public Integer insertItemDesc(ItemDesc itemDesc){
		return itemDecsMapper.insertItemDesc(itemDesc);
	}

	public Integer updateItemDesc(ItemDesc itemDesc){
		return itemDecsMapper.updateItemDesc(itemDesc);
	}

	public Integer deleteItemDesc(Long itemID){
		return itemDecsMapper.deleteItemDesc(itemID);
	}
}
