package com.myapp.tdd.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.myapp.tdd.junit5.database.Database;
import com.myapp.tdd.junit5.database.DatabaseUtil;
//@ExtendWith(MockitoExtension.class)
public class DatabaseTest {
	@Spy
	private Database database;
	
	private List<List<String>> queriedData;
	
	private List<Flight> flightsList;
	
	public DatabaseTest() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		queriedData=new ArrayList<>();
		
		List<String> row1 = Arrays.asList("1","e","Pass1","false","500");
		List<String> row2 = Arrays.asList("2","b","Pass2","true","300");
		List<String> row3 = Arrays.asList("3","e","Pass3","false","400");
		List<String> row4 = Arrays.asList("4","b","Pass4","true","800");
		queriedData.add(row1);
		queriedData.add(row2);
		queriedData.add(row3);
		queriedData.add(row4);
		
		
	}

	@Test
	public void testQueriedData() {
		when(database.queryFlightDatabase()).thenReturn(queriedData);
		flightsList = DatabaseUtil.buildFlightsList(queriedData);
		assertEquals(4,database.queryFlightDatabase().size());
		assertEquals(300,database.minimumDistance(flightsList));
		assertEquals(800,database.maximumDistance(flightsList));
		assertEquals(500,database.averageDistance(flightsList));
	}
}