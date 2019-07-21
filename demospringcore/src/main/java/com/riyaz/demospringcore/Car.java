package com.riyaz.demospringcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	private Tyre tyres;
	
	public Tyre getTyre() {
		return tyres;
	}

	public void setTyre(Tyre tyres) {
		this.tyres = tyres;
	}


	public void drive() {
		System.out.println("Driving a car!! " + tyres);
	}
}
