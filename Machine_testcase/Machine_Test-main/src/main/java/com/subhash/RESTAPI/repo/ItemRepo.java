package com.mohit.RESTAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohit.RESTAPI.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

}
