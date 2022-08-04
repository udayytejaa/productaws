package com.ecommerce.ecommerce.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscription")
public class subsprod {

	@Id
	int buyer_id;
	@Column(nullable = false)
	int prod_id;
	@Column(nullable = false)
	int quantity;
	
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
		return quantity;
	}
	public void setQunatity(int qunatity) {
		this.quantity = qunatity;
	}
}
