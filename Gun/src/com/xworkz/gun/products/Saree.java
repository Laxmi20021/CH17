package com.xworkz.gun.products;

public class Saree {


	private String name;
	private double cost;
	private String color;

	public Saree() {
		System.out.println("created saree constructor with no arg...");
	}

	public Saree(String name, double cost, String color) {
		super();
		this.name = name;
		this.cost = cost;
		this.color = color;
	}

	public void enhanceLook() {
		System.out.println("running enhancelook in Saree");
	}

	public void print() {
		System.out.println("saree name: " + name);
		System.out.println("saree cost: " + cost);
		System.out.println("saree color: " + color);
	}

}