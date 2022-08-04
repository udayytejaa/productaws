package com.ecommerce.ecommerce.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {

	@Id
	int prod_id;
	@Column(nullable = false)
	String product_name;
	@Column(nullable = false)
	int price;
	@Column(nullable = false)
	int stock;
	@Column(nullable = false)
	String Description;
	@Column(nullable = false)
	String image;
	@Column(nullable = false)
	int seller_id;
	@Column(nullable = false)
	String category;
	@Column(nullable = false)
	String subcategory;
	@Column(nullable = false)
	int productrating;
	
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prodid) {
		this.prod_id = prodid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String productname) {
		this.product_name = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int sellerid) {
		this.seller_id = sellerid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public int getProductrating() {
		return productrating;
	}
	public void setProductrating(int productrating) {
		this.productrating = productrating;
	}
}
