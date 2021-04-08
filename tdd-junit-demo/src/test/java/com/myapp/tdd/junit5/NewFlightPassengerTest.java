package com.myapp.tdd.junit5;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NewFlightPassengerTest {

	public NewFlightPassengerTest() {
		
		@DisplayName("Given Their is a economy flight")
		@Nested
		class EconomyFlightTest{
			private Flight economyFlight;
			
			@BeforeEach
			void setUp() {
				economyFlight = new EconomyFlight("12");
						
			}
			
			@AfterEach
			void tearDown() {
				economyFlight = new EconomyFlight("12");
			}
			
			@Test
			public void testEconomyFlightRedularPassenger() {
				Passenger passenger = new Passenger("Passe1", false);
				assertEquals("1", economyFlight.getId());
				assertEquals(true, economyFlight.getList().add(passenger));
				assertEquals(1, economyFlight.getList().size());
				assertEquals(true, economyFlight.getList().add(passenger));
	
			}
		}
		// TODO Auto-generated constructor stub
		
		@DisplayName("Given Their is a Business flight")
		@Nested
		class BusinessFlightTest{
			private Flight BusinessFlight;
			
			@BeforeEach
			void setUp() {
				BusinessFlight = new BusinessFlight("12");
						
			}
			
			@AfterEach
			void tearDown() {
				BusinessFlight = new BusinessFlight("12");
			}
			
			@Test
			public void testBusinessFlightRedularPassenger() {
				Passenger passenger = new Passenger("Passe1", false);
				assertEquals("1", BusinessFlight.getId());
				assertEquals(true, BusinessFlight.getList().add(passenger));
				assertEquals(1, BusinessFlight.getList().size());
				assertEquals(true, BusinessFlight.getList().add(passenger));
	
			}
		}
	}

}
