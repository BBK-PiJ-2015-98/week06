package week6

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(113); 
  
  
	def food(base: String)(topping: String) = println(s"$base with $topping");System.out.println("""food: (base: String)(topping: String)Unit""");$skip(80); 
	
	def foodWithChocolateTopping(mainFood: String) = food(mainFood)("chocolate");System.out.println("""foodWithChocolateTopping: (mainFood: String)Unit""");$skip(54); 
	def pancakeWithIDontCareTopping = food("pancake")(_);System.out.println("""pancakeWithIDontCareTopping: => String => Unit""");$skip(39); 
	
	foodWithChocolateTopping("pancake");$skip(39); 
	foodWithChocolateTopping("milkshake");$skip(40); 
	pancakeWithIDontCareTopping("vanilla")}
  
}
