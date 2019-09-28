package com.sohel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sohel.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

	Order findByOrderId(Long orderId);
}
