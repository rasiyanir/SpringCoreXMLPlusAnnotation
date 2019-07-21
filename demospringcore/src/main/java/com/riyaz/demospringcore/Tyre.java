package com.riyaz.demospringcore;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;
	private int price;
	

	
	/*
	 * public Tyre(String brand, int price) { super(); this.brand = brand;
	 * this.price = price; }
	 */

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Its Working";
	}

	
	
	
}
