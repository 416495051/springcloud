package cn.hs.provider.mapper;

import cn.hs.provider.eneity.Item;
import org.apache.ibatis.annotations.*;

public interface ItemMapper {

	@Select("select * from item where id=#{id}")
	@Results(id = "itemMap",value = {
		@Result(id = true,column = "id",property = "id"),
		@Result(column = "title",property = "title"),
		@Result(column = "sell_point",property = "sellPoint"),
		@Result(column = "price",property = "price"),
		@Result(column = "num",property = "num"),
		@Result(column = "barcode",property = "barcode"),
		@Result(column = "image",property = "image"),
		@Result(column = "cid",property = "cid"),
		@Result(column = "status",property = "status"),
		@Result(column = "created",property = "created"),
		@Result(column = "updated",property = "updated")
	})
	Item queryItemById(Long id);

	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	@Insert("insert into item (title,sell_point,price,num,barcode,image,cid,status,created,updated) " +
			"values (#{title},#{sellPoint},#{price},#{num},#{barcode},#{image},#{cid},#{status},#{created,jdbcType=TIMESTAMP},#{updated,jdbcType=TIMESTAMP})")
	@ResultMap("itemMap")
	Long insertItem(Item item);

	@Update("update item set title=#{title},sell_point=#{sellPoint},price=#{price},num=#{num},barcode=#{barcode}," +
			"image=#{image},cid=#{cid},status=#{status},created=#{created,jdbcType=TIMESTAMP}," +
			"updated=#{updated,jdbcType=TIMESTAMP} where id=#{id}")
	@ResultMap("itemMap")
	Integer updateItem(Item item);

	@Delete("update item set status=3 where id=#{id}")
	Integer deleteItem(Long id);

}
