package com.mohit.RESTAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mohit.RESTAPI.model.Item;
import com.mohit.RESTAPI.model.Orders;
import com.mohit.RESTAPI.exception.InvalidItemByException;
import com.mohit.RESTAPI.service.ItemService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/order")
public class ItemController {

	@Autowired
	ItemService itemService;

	@GetMapping
	public ResponseEntity<List<Item>> getFindAllItems() {
		log.info("ItemController, getFindAllItems() Started");
		List<Item> items = itemService.findAllItems();
		ResponseEntity<List<Item>> responseEntity = new ResponseEntity<List<Item>>(items, HttpStatus.OK);
		log.info("ItemController, getFindAllItems() Ended");
		return responseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<List<Orders>> findAllPages(@PathVariable("id") long id) throws InvalidItemByException {
		log.info("ItemController, findAllPages() Started");
		List<Orders> orders = itemService.findItemsById(id).getOrders();
		ResponseEntity<List<Orders>> responseEntity = new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
		log.info("ItemController, findAllPages() Ended");
		return responseEntity;
	}

	@PostMapping
	public ResponseEntity<Item> saveItem(@RequestBody Item item) {
		log.info("ItemController, saveItem() Started");
		Item itemSaved = itemService.saveItem(item);
		ResponseEntity<Item> responseEntity = new ResponseEntity<Item>(itemSaved, HttpStatus.CREATED);
		log.info("ItemController, saveItem() Ended");
		return responseEntity;
	}

}
