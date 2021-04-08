package com.myapp.bdd.loyality;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuperSmoothieStepDefinitions {
	private DrinkCatalog drinkCatalog=new DrinkCatalog();
	private SuperSmoothieSchema superSmoothieSchema=new SuperSmoothieSchema(drinkCatalog);
	private MorningFreshnessMember customer1;
	
	

		@Given("the following drink categories:")
		public void the_following_drink_categories(List<Map<String,String>>drinkCategories) {
		    drinkCategories.stream().forEach(drinkCategory->{
		    	String drink=drinkCategory.get("Drink");
		    	String category=drinkCategory.get("Category");
		    	Integer points =Integer.parseInt(drinkCategory.get("Points"));
		    	drinkCatalog.addDrink(drink, category);
		    	superSmoothieSchema.setPointsPerCategory(category, points);
		    });
		}
		@Given("^(.*) is a Morning Freshness Member$")
		public void customer1_is_a_Morning_Freshness_Member(String name) {
			customer1=new MorningFreshnessMember(name, superSmoothieSchema);
			
			
		}
		
		@When("^(.) purchases(\\d+) (.) drinks$")
		public void customer1_prchases_drinks(String name,Integer amount,String drink) {
			customer1.orders(amount, drink);
		   
		}
		@Then("He should earn {int} points")
		public void he_should_earn_points(Integer expectedPoints) {
			assertEquals(expectedPoints, customer1.getPoints());
			
		   
		}

			

}