package com.myapp.tdd.junit5;
import java.util.ArrayList;
import java.util.List;
public abstract class Flight {
	
	private String id;
	private List<Passenger> list = new ArrayList<>();
    
	
    private int distance;

	public Flight(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Passenger> getList() {
		return list;
	}

	public void setList(List<Passenger> list) {
		this.list = list;
	}
	
	public abstract boolean addPassenger(Passenger passenger);
	public abstract boolean removePassenger(Passenger passenger);

	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}
	 
//	public boolean addPassenger(Passenger passenger ) {
//		switch (flightType) {
//		case "Economy":
//			return list.add(passenger);
//		case "Business":
//			if(passenger.isVip()){
//				return list.add(passenger);
//			}
//			else return true;
//		default:
//			throw new RuntimeException("Unknown Flight Type "+flightType);
//		}
//	}
//	
//	public boolean removePassenger(Passenger passenger ) {
//		switch (flightType) {
//		
//		case "Economy":
//			
//			if(passenger.isVip()){
//				return false;
//				}
//			
//		case "Business":
//			
//		    return false;
//		    
//		default:
//			throw new RuntimeException("Unknown Flight Type "+flightType);
//			}
//				
//				
//		
//	}
//	
//	
//	
}