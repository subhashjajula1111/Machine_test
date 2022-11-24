package com.mohit.RESTAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long orderId;
	String orderDate;
	String orderStatus;	
	@ManyToOne(optional = false)
	@JoinColumn(name = "item_id", nullable = false)
	Item items;
	
	public Orders(String orderDate, String orderStatus) {
		super();
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}	
}
