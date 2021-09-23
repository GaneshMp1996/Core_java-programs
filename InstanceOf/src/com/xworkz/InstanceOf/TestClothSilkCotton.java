package com.xworkz.InstanceOf;

public abstract class TestClothSilkCotton {
	public static void main(String[] args) {
		Cotton cotton = new Cotton();
		@SuppressWarnings("unused")
		Silk silk = new Silk();
		Material material = new Material();
		material.stitch(cotton);
	}

}
