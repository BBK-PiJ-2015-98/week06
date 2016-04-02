
import com.atomicscala.AtomicTest._

/**
Parameterised Types
17. Modify the method explicit in the following code:
import atomic.AtomicTest._
// Return type is inferred:
def inferred(c1: Char, c2: Char, c3: Char) = {
Vector(c1, c2, c3)
}
// Explicit return type:
def explicit(c1: Char, c2: Char, c3: Char):
Vector[Char] = {
Vector(c1, c2, c3)
}
inferred('a', 'b', 'c') is "Vector(a, b, c)"
explicit('a', 'b', 'c') is "Vector(a, b, c)"
so it creates and returns a Vector of Double. Satisfy the following tests:
explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

18. Building on the previous exercise, alter explicit to take a Vector and create and
return a List. Refer to the ScalaDoc for List, if necessary.
Satisfy the following tests:
explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

19. Building on the previous exercise, change explicit to return a Set.
Satisfy the following tests:
explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
 */
object TypeExcercise extends App{
  
  def inferred(c1: Double, c2: Double, c3:Double ) = {Vector(c1, c2, c3)}
  
  def explicitDouble(c1: Double, c2: Double, c3: Double): Vector[Double] = {  Vector(c1, c2, c3)}
   
  def explicitList (c1: Vector[Double]): List[Double] = { c1. toList}
  
  def explicitSet (c1: Vector[Double]): Set[Double] = { c1. toSet}

                                                              
explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)
explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)

explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
  
}