package com.myapp.tdd.junit5;

public class Thermometer {

	private double temprature;
	
	private Sensor sensor;

	/**
	 * @return the temprature
	 */
	public double getTemprature() {
		if (sensor.isBlocked()) {
			throw new RuntimeException("Sensor is blocked");
		}
		return temprature;
	}

	/**
	 * @param temprature the temprature to set
	 */
	public void setTemprature(double temprature) {
		this.temprature = temprature;
	}

	/**
	 * @return the sensor
	 */
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * @param sensor the sensor to set
	 */
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	
}
