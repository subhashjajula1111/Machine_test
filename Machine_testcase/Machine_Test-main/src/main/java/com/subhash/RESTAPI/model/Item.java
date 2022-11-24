package com.mohit.RESTAPI.model;

import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long itemId;
	String itemName;
	int itemUnitPrice;
	int itemQuantity;
	@JsonIgnore
	@OneToMany(mappedBy = "items", cascade = CascadeType.ALL)
	List<Orders> orders;
	
	public Item(String itemName, int itemUnitPrice, int itemQuantity) {
		super();
		this.itemName = itemName;
		this.itemUnitPrice = itemUnitPrice;
		this.itemQuantity = itemQuantity;
	}
}
