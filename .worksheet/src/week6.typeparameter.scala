package week6

object typeparameter {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(162); 
  
  def dogVector (V: Vector[Int], f: Int=>Int )= {
     
    var S = ""
    
     S= S + ((V) foreach (x=> x*7))
     
  };System.out.println("""dogVector: (V: Vector[Int], f: Int => Int)Unit""");$skip(40); 
  
  
  
  val dogYears= (y: Int)=> y*7;System.out.println("""dogYears  : Int => Int = """ + $show(dogYears ));$skip(20); 
  
    var c="1234";System.out.println("""c  : String = """ + $show(c ));$skip(16); 
    var str= "";System.out.println("""str  : String = """ + $show(str ));$skip(34); val res$0 = 
   (c) foreach (str.append (","));System.out.println("""res0: <error> = """ + $show(res$0));$skip(44); 
  
  dogVector(Vector(1, 5, 7, 8), x=> x*7);$skip(15); val res$1 = 
  dogYears(10);System.out.println("""res1: Int = """ + $show(res$1))}
  
}
