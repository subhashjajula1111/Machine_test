package com.mohit.RESTAPI.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import com.mohit.RESTAPI.model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Long> {

    // @Query("SELECT O FROM Orders O WHERE o.orderId=:orderId")
    // Optional<Orders> findById(@Param("orderId") String orderId);

}
