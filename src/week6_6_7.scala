

import com.atomicscala.AtomicTest._

// with in the calss defination you can define the variable

/**
6. Define a class SimpleTime that takes two arguments: an Int that represents hours,
and an Int that represents minutes. Use named arguments to create a SimpleTime
object. Satisfy the following tests:
val t = new SimpleTime(hours=5, minutes=30)
t.hours is 5
t.minutes is 30
 */

/**
 Using the solution for SimpleTime above, default minutes to 0 so that you don’t
have to specify them. Satisfy the following tests:
Page 2
val t2 = new SimpleTime2(hours=10)
t2.hours is 10
t2.minutes is 0
 */



class SimpleTime(val hours: Int, val minutes: Int =0 ) {
  
 
}

object SimpleTime extends App {
  
  val t = new SimpleTime(hours=5, minutes=30)
  
  t.hours is 5
  t.minutes is 30
  
  val t2 = new SimpleTime(hours=10)
  t2.hours is 10
  t2.minutes is 0
  
  
}