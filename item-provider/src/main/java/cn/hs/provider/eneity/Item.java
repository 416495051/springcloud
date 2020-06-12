package cn.hs.provider.eneity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {
	private Long id; //商品id
	private String title; //商品标题
	private String sellPoint; //商品卖点
	private Long price;	//商品价格
	private Integer num;	//商品库存
	private String barcode;	//商品条形码
	private String image;	//商品图片
	private Long cid;	//所属类目
	private Integer status;	//商品状态，1-上架，2-下架，3-删除
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date created;	//创建时间
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date updated;	//更新时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSellPoint() {
		return sellPoint;
	}

	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "item{" +
				"id=" + id +
				", title='" + title + '\'' +
				", sellPoint='" + sellPoint + '\'' +
				", price=" + price +
				", num=" + num +
				", barcode='" + barcode + '\'' +
				", image='" + image + '\'' +
				", cid=" + cid +
				", status=" + status +
				", created=" + created +
				", updated=" + updated +
				'}';
	}
}
