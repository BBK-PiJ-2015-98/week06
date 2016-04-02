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

object pattern_matching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(779); 

  forecast(100) is "Sunny";$skip(33); 
  forecast(80) is "Mostly Sunny";$skip(33); 
  forecast(50) is "Partly Sunny";$skip(33); 
  forecast(20) is "Mostly Sunny";$skip(26); 
  forecast(0) is "Cloudy";$skip(28); 
  forecast(15) is "Unknown";$skip(349); 

 

 

  

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
  };System.out.println("""forecast: (temp: Int)String""");$skip(58); 

 var family1 = new Family("Mum", "Dad", "Sally", "Dick");System.out.println("""family1  : week6.Family = """ + $show(family1 ));$skip(20); val res$0 = 
 family1.familySize;System.out.println("""res0: Int = """ + $show(res$0))}
}

class Family(list: String*) {

  	def familySize = list.length
		
   def familylist(): Seq[String] = list

}
