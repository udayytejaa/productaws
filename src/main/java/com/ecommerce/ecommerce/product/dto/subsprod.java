package com.ecommerce.ecommerce.product.dto;

public class subsprod {
	int buyer_id;
	int prod_id;
	int qunatity;
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyerid) {
		this.buyer_id = buyerid;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prodid) {
		this.prod_id = prodid;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	@Override
	public String toString() {
		return "subsprod [buyerid=" + buyer_id + ", prodid=" + prod_id + ", qunatity=" + qunatity + "]";
	}
	

}
