
import com.atomicscala.AtomicTest._
/**
 *
 * 11. Create a new class Tea that has two methods:
 * describe — which includes information about whether the tea includes milk, sugar,
 * is decaffeinated, and includes the name; and
 * calories — which adds 100 calories for milk and 16 calories for sugar.
 * Satisfy the following tests:
 *
 * object TeaScript extends App {
 * val tea = new Tea
 * tea.describe is "Earl Grey"
 * tea.calories is 0
 *
 * val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
 * lemonZinger.describe is "Lemon Zinger decaf"
 * lemonZinger.calories is 0
 *
 * val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
 * sweetGreen.describe is "Jasmine Green + sugar"
 * sweetGreen.calories is 16
 *
 * val teaLatte = new Tea(sugar=true, milk=true)
 * teaLatte.describe is "Earl Grey + milk + sugar"
 * te
 */

object teaMain extends App {

 /* val tea = new Tea(name = "Earl Grey")
  tea.describe is "Earl Grey"
  tea.calories is 0

  val lemonZinger = new Tea(decaf = true, name = "Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger Decaf"
* lemonZinger.calories is 0
*/
  val sweetGreen = new Tea(name = "Jasmine Green ", sugar = true)
  sweetGreen.describe is "Jasmine Green + sugar"
  //sweetGreen.calories is 16
 

}
class Tea(var decaf: Boolean = false, var sugar: Boolean = false, var milk: Boolean = false, name: String) {

  var result = s"$name"
  var Calories_value = 0
  var Milk_calories = 100
  var Sugar = 16

  def describe()= {
    if (decaf) result += " Decaf" else s"$result"
    if (sugar) result += "+ sugar" else s"$result"

   
  }

  def calories()= {
    if (milk) Calories_value += Milk_calories else Calories_value
    if (sugar) Calories_value += Sugar else Calories_value 
   
  }

}