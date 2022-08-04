package com.ecommerce.ecommerce.product.dto;

public class product {
	
	int prod_id ;
	String product_name;
	int price;
	int stock;
	String Description;
	String image;
	@Override
	public String toString() {
		return "product [prodid=" + prod_id + ", productname=" + product_name + ", price=" + price + ", stock=" + stock
				+ ", Description=" + Description + ", image=" + image + ", sellerid=" + seller_id + ", category="
				+ category + ", subcategory=" + subcategory + ", productrating=" + productrating + "]";
	}
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
	int seller_id;
	String category;
	String subcategory;
	int productrating;

}
