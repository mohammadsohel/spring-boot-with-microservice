package com.sohel.helper;

import org.springframework.beans.BeanUtils;

import com.sohel.dto.OrderDTO;
import com.sohel.entity.Order;

public class BeanHelper {

	public static OrderDTO entityToDTO(Order order) {
		OrderDTO orderDTO = new OrderDTO();

		BeanUtils.copyProperties(order, orderDTO);
		return orderDTO;
	}

	public static Order DTOToEntity(OrderDTO orderDto) {
		Order order = new Order();

		BeanUtils.copyProperties(orderDto, order);
		return order;
	}

}
