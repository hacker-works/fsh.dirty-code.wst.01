package com.shoestore.repo;

import com.shoestore.domain.Order;

public interface OrderRepo {

	Order getOrderByShopperId(long shopperId);

	Order commit(Order order);
	void rollback(Order order);

}
