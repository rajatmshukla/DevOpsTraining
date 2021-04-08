package com.myapp.tdd.junit5;

public class AirconditioningSystem {

	private Thermometer thermometer;
	private double tempratureThreshold;
	private boolean open;
	
	public AirconditioningSystem() {
		open = false;
	}
	public void checkAirConditioningSystem()
	{
		this.open = (thermometer.getTemprature()>=tempratureThreshold);
	}
	/**
	 * @return the thermometer
	 */
	public Thermometer getThermometer() {
		return thermometer;
	}
	/**
	 * @param thermometer the thermometer to set
	 */
	public void setThermometer(Thermometer thermometer) {
		this.thermometer = thermometer;
	}
	/**
	 * @return the tempratureThreshold
	 */
	public double getTempratureThreshold() {
		return tempratureThreshold;
	}
	/**
	 * @param tempratureThreshold the tempratureThreshold to set
	 */
	public void setTempratureThreshold(double tempratureThreshold) {
		this.tempratureThreshold = tempratureThreshold;
	}
	/**
	 * @return the open
	 */
	public boolean isOpen() {
		return open;
	}
	/**
	 * @param open the open to set
	 */
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
}
