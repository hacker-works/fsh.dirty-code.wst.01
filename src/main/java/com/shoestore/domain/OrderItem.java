package com.shoestore.domain;

public abstract class OrderItem {
	private long id;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		OrderItem other = (OrderItem) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
