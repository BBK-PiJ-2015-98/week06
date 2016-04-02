package week6

object currying {
  
  
	def food(base: String)(topping: String) = println(s"$base with $topping")
                                                  //> food: (base: String)(topping: String)Unit
	
	def foodWithChocolateTopping(mainFood: String) = food(mainFood)("chocolate")
                                                  //> foodWithChocolateTopping: (mainFood: String)Unit
	def pancakeWithIDontCareTopping = food("pancake")(_)
                                                  //> pancakeWithIDontCareTopping: => String => Unit
	
	foodWithChocolateTopping("pancake")       //> pancake with chocolate
	foodWithChocolateTopping("milkshake")     //> milkshake with chocolate
	pancakeWithIDontCareTopping("vanilla")    //> pancake with vanilla
  
}