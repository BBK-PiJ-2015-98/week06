
import com.atomicscala.AtomicTest._

object second_2 extends App {

  val sunnyData = Vector(100, 80, 50, 20, 0, 15)
  for (temp <- sunnyData)
    
  forecast(100)
  
  def forecast(temp: Int): String = temp match {
    case 100 => "Sunny"
    case 80  => "Mostly Sunny"
    case 50  => "Partly Sunny"
    case 20  => "Mostly Sunny"
    case 0   => "Cloudy"
    case 15  => "Unknown"

  } 



}