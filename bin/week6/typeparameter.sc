package week6

object typeparameter {
  
  def dogVector (V: Vector[Int], f: Int=>Int )= {
     
    var S = ""
    
     S= S + ((V) foreach (x=> x*7))
     
  }
  
  
  
  val dogYears= (y: Int)=> y*7
  
    var c="1234"
    var str= ""
   (c) foreach (str.append (","))
  
  dogVector(Vector(1, 5, 7, 8), x=> x*7)
  dogYears(10)
  
}