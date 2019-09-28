package com.sohel.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sohel.dto.OrderDTO;
import com.sohel.entity.Order;
import com.sohel.helper.BeanHelper;
import com.sohel.repository.OrderRepository;

@Component
public class OrderHandler {

	@Autowired
	private OrderRepository orderRepository;

	public Order saveRecord(OrderDTO orderDTO)

	{

		return orderRepository.save(BeanHelper.DTOToEntity(orderDTO));
	}

	public Order getRecord(Long oderId)

	{

		return orderRepository.findByOrderId(oderId);
	}

}
