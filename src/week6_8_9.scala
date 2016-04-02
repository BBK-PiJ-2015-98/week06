
import com.atomicscala.AtomicTest._
/**
 *Create a class Planet that has, by default, a single moon. The Planet class should
have a name (String) and description (String). Use named arguments to specify the
name and description, and a default for the number of moons. Satisfy the following
tests:
val p = new Planet(name = "Mercury",
description = "small and hot planet", moons = 0)
p.hasMoon is false



/**
 Modify your solution for the previous exercise by changing the order of the arguments
that you use to create the Planet. Did you have to change any code? Satisfy the
following tests:
val earth = new Planet(moons = 1, name = "Earth",
description = "a hospitable planet")
earth.hasMoon is true
 */

 */


class Planet (val moons: Int= 1, name: String, description: String) {
  def hasMoon (): Boolean= if (moons > 0) true else false
}

object run extends App {
  
  val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
  p.hasMoon is false
  
  val earth = new Planet(moons = 1, name = "Earth",description = "a hospitable planet")
  earth.hasMoon is true

  
}