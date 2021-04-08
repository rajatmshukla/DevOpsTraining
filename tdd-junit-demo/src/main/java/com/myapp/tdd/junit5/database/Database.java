
package com.myapp.tdd.junit5.database;



import java.util.ArrayList;
import java.util.List;
import com.myapp.tdd.junit5.Flight;

public class Database {

	private List<List<String>> queriedData= new ArrayList<>();
	public Database() {
		// TODO Auto-generated constructor stub
	}
	
	public List<List<String>> queryFlightDatabase(){
		return queriedData;
	}
	
	public final double averageDistance(List<Flight> flightsList) {
		
		return flightsList.stream().mapToDouble(Flight::getDistance).average().getAsDouble();

	}
	
	public final int minimumDistance(List<Flight> flightsList) {
		
		return flightsList.stream().mapToInt(Flight::getDistance).min().getAsInt();

	} 
	public final int maximumDistance(List<Flight> flightsList) {
		
		return flightsList.stream().mapToInt(Flight::getDistance).max().getAsInt();

	} 
}
