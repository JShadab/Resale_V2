package com.tekharamain.resale.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Feedbacks")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String text;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", text=" + text + ", product=" + product + "]";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		

	}

	public Product getProduct() {
		return product;
	}

	@JsonProperty("productId")
	public Long getProductId() {
		return product.getId();
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
