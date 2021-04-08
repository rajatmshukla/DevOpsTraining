package com.myapp.tdd.junit5.database;

import java.util.ArrayList;
import java.util.List;

import com.myapp.tdd.junit5.BusinessFlight;
import com.myapp.tdd.junit5.EconomyFlight;
import com.myapp.tdd.junit5.Flight;
import com.myapp.tdd.junit5.Passenger;

public class DatabaseUtil {

	public DatabaseUtil() {
		// TODO Auto-generated constructor stub
	}
	public static List<Flight>buildFlightsList(List<List<String>> queriedData){
	List<Flight> flightList=new ArrayList<>();
	for(List<String> row:queriedData) {
		Flight flight=null;
		if(row.get(1).equals("e")) {
			flight=new EconomyFlight(row.get(0));
			
		}else if(row.get(1).equals('b')) {
			flight=new BusinessFlight(row.get(0));
		}
		flight.addPassenger(new Passenger(row.get(2),Boolean.valueOf(row.get(3))));
		flight.setDistance(Integer.valueOf(row.get(4)));
		flightList.add(flight);
	}
	return flightList;
	}

}