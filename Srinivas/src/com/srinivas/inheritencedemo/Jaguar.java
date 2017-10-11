package com.srinivas.inheritencedemo;

public class Jaguar implements Vehicle{

	@Override
	public void start() {
		System.out.println("Jaguar provides Keyless start");
	}

	@Override
	public void stop() {
		System.out.println("Jaguar can stop within 5 sec from 150 miles/hr speed");
	}

	@Override
	public void hasMileage() {
		System.out.println("Jaguar has a mileage of 10 miles/ltr");
	}

	@Override
	public void speed() {
		System.out.println("Jaguar can run at a speed of 300 miles/hr");
	}

	@Override
	public void safety() {
		System.out.println("Jaguar provides 6 Airbags.");
	}

	public void entertainment() {
		System.out.println("Jaguar provides LED Screen and Dolby Digital Audio");
	}

	public void entertainment(String carName) {
		System.out.println("Jaguar provides LED Screen and Dolby Digital Audio to "+carName);
	}
	public void entertainment(int carNumber) {
		System.out.println("Jaguar provides LED Screen and Dolby Digital Audio to "+carNumber);
	}
	public void entertainment(String carName, String carColor) {
		System.out.println("Jaguar provides LED Screen and Dolby Digital Audio to "+carName);
	}
	
}
