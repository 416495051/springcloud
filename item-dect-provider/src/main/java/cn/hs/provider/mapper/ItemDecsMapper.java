package cn.hs.provider.mapper;

import cn.hs.provider.eneity.ItemDesc;
import org.apache.ibatis.annotations.*;

public interface ItemDecsMapper {

	@Select("select * from item_desc where item_id=#{itemID}")
	@Results(id = "itemDescMap",value = {
			@Result(id = true,column = "item_id",property = "itemID"),
			@Result(column = "item_desc",property = "itemDesc"),
			@Result(column = "created",property = "created"),
			@Result(column = "updated",property = "updated")
	})
	ItemDesc queryItemDescById(Long itemID);

	@Insert("insert into item_desc (item_id,item_desc,created,updated) " +
			"values(#{itemID},#{itemDesc},#{created,jdbcType=TIMESTAMP},#{updated,jdbcType=TIMESTAMP})")
	@ResultMap("itemDescMap")
	Integer insertItemDesc(ItemDesc itemDesc);

	@Update("update item_desc set item_desc=#{itemDesc},created=#{created,jdbcType=TIMESTAMP}," +
			"updated=#{updated,jdbcType=TIMESTAMP} where item_id=#{itemID}")
	@ResultMap("itemDescMap")
	Integer updateItemDesc(ItemDesc itemDesc);

	@Delete("delete from item_desc where item_id=#{itemID}")
	@ResultMap("itemDescMap")
	Integer deleteItemDesc(Long itemID);

}
