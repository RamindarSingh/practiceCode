package com.careerCup;

public class mainClass {

	public static void main(String[] args) {
		Tuttle tuttle = new Tuttle('N', 1, 1);
		
		tuttle.moveTuttleAround("FFFRRFLF");

		System.out.println("Direction : " + tuttle.getDir() + " " + tuttle.getX() + ", "+ tuttle.getY());
	}

}
