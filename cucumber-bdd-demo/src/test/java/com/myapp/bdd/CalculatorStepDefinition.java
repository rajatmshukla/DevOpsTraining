package com.myapp.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorStepDefinition {
	
	Calculator calculator;
	Integer result = 0;
	

		@Given("I have a calculator")
		public void i_have_a_calculator() {
		    // Write code here that turns the phrase above into concrete actions
		    calculator = new Calculator();
		}
		
		@When("I add {int} and {int}")
		public void i_add_and_(Integer int1,Integer int2) {
		    // Write code here that turns the phrase above into concrete actions
		    result = calculator.add(int1,int2);
		}
		
		@Then("I should get {int}")
		public void i_should_get(Integer expectedResult) {
		    // Write code here that turns the phrase above into concrete actions
		    assertEquals(expectedResult, result);
		}
		
		
		


}