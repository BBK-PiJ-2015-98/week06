
import com.atomicscala.AtomicTest._
/**
 Auxiliary Constructors
12. Create a class called ClothesWasher with a default constructor and two auxiliary constructors,
one that specifies modelName (as a String) and one that specifies capacity
(as a Double).
13. Create a class ClothesWasher2 that looks just like your solution above, but use
named and default arguments instead so that you can produce the same results with
just a default constructor.
14. Show that the first line of an auxiliary constructor must be a call to the primary
constructor.
 */




class ClothesWasher(val model: String, val capacity: Double) {
  val cycles = 5

  def this(model: String) = {
    this(model, 2)
  }

  def this(capacity: Double) = {
    this("Unknown", capacity)
  }

  def this() = {
    this("Unknown", 2)
  }

}

object ClothesWasherTest extends App {

  val washer1 = new ClothesWasher
  washer1.capacity is 2D
  washer1.model is "Unknown"
  
/*
  val washer2 = new ClothesWasher("AllInOne")
  washer2.capacity is 2D
  washer2.model is "AllInOne"

  val washer3 = new ClothesWasher(3.6D)
  washer3.capacity is 3.6D
  washer3.model is "Unknown"
*/

}