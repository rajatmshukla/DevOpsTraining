  Feature: Super Smoothie Loyality Card program
  
  The more smoothie you buy, more points we earn
  
  Background:
  	Given The following drink categories:
  		|Drink							|Category |Points|
  		|Banana							|Regular   |	15	 |
  		|Triple Berry Blend	                       |Fancy 	  |	20	 |
  		|Early Grey					       |Tea 		  |	10	 |

    Scenario Outline: Earning Points when purchasing smoothie
      Given Customer1 is a Morning Freshness Member
      When Customer1 purchases <Quantity> <Drink> drinks
      Then He should earn <Points> points
      Examples:
      |Drink							|Quantity |Points   |
      |Banana							|2  		 |	30	 |
      |Triple Berry Blend                          	|1  		 |	20	 |
      |Early Grey					        |3	 	 |	30	 |
      