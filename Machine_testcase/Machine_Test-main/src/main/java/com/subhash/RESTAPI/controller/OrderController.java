package com.mohit.RESTAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mohit.RESTAPI.model.Orders;
import com.mohit.RESTAPI.service.OrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping
	public ResponseEntity<List<Orders>> findAllOrders() {
		log.info("OrderController, getFindAllItems() Started");
		List<Orders> orders = orderService.findAllOrders();
		ResponseEntity<List<Orders>> responseEntity = new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
		log.info("OrderController, findAllOrders() Started");
		return responseEntity;
	}

	@PostMapping
	public ResponseEntity<Orders> saveOrder(@RequestBody Orders order) {
		log.info("OrderController, saveOrder() Started");
		Orders orderSaved = orderService.saveOrder(order);
		ResponseEntity<Orders> responseEntity = new ResponseEntity<Orders>(orderSaved, HttpStatus.CREATED);
		log.info("OrderController, saveOrder() Started");
		return responseEntity;
	}
}
