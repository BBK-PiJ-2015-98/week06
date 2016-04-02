package week6

import com.atomicscala.AtomicTest._

/*1. Create a method forecast that represents the percentage of cloudiness, and use it to
produce a “weather forecast” string such as “Sunny” (100), “Mostly Sunny” (80),
“Partly Sunny” (50), “Mostly Cloudy” (20), and “Cloudy” (0). For this exercise,
only match for the legal values 100, 80, 50, 20, and 0. All other values should produce
“Unknown”.
Satisfy the following tests:
package forecast
import atomic.AtomicTest._
object MyForecastTest extends App {
forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Sunny"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"
def forecast(temp: Int): String = ???
} */

object pattern_matching {

  forecast(100) is "Sunny"                        //> Sunny
  forecast(80) is "Mostly Sunny"                  //> Mostly Sunny
  forecast(50) is "Partly Sunny"                  //> Partly Sunny
  forecast(20) is "Mostly Sunny"                  //> Mostly Sunny
  forecast(0) is "Cloudy"                         //> Cloudy
  forecast(15) is "Unknown"                       //> Unknown

 

 

  

  // println (family1)

  // var a =family1.loppe

  //def loppe (fami: List[String]): Int = { fami.length }

  def forecast(temp: Int): String = temp match {
    case 100 => "Sunny"
    case 80  => "Mostly Sunny"
    case 50  => "Partly Sunny"
    case 20  => "Mostly Sunny"
    case 0   => "Cloudy"
    case 15  => "Unknown"
  }                                               //> forecast: (temp: Int)String

 var family1 = new Family("Mum", "Dad", "Sally", "Dick")
                                                  //> family1  : week6.Family = week6.Family@13afe78
 family1.familySize                               //> res0: Int = 4
}

class Family(list: String*) {

  	def familySize = list.length
		
   def familylist(): Seq[String] = list

}