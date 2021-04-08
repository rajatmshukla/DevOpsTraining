package com.myapp.tdd.junit5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AirconditioningTest {
	
	@InjectMocks
	AirconditioningSystem airconditioningSystem;
	
	@Mock
	Thermometer thermometer;
	
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAirConditionStarted() {
		when(thermometer.getTemprature()).thenReturn(25.0);
		airconditioningSystem.setTempratureThreshold(25.0);
		airconditioningSystem.checkAirConditioningSystem();
		assertTrue(airconditioningSystem.isOpen());
		verify(thermometer,times(1)).getTemprature();
		
		
	}
	@Test
	public void testAirConditionStopped() {
		when(thermometer.getTemprature()).thenReturn(23.0);
		airconditioningSystem.setTempratureThreshold(24.0);
		airconditioningSystem.checkAirConditioningSystem();
		assertFalse(airconditioningSystem.isOpen());
		verify(thermometer,times(1)).getTemprature();
		
		
	}
	
	

}