package cn.hs.provider.service;

import cn.hs.provider.eneity.Item;
import cn.hs.provider.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemMapper itemMapper;

	public Item queryItemById(Long id){
		return itemMapper.queryItemById(id);
	}

	public Long insertItem(Item item){
		itemMapper.insertItem(item);
		return item.getId();
	}

	public Integer updateItem(Item item){
		return itemMapper.updateItem(item);
	}

	public Integer deleteItem(Long id){
		return itemMapper.deleteItem(id);
	}
}
