package week6

// WHY IS THE RETURN FUNCTION IS UNIT INSTEAD OF INT
import com.atomicscala.AtomicTest._

object sum {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(142); 

  sumSquareList(2) is 4;$skip(28); 
  sumSquareList(2, 4) is 20;$skip(85); 

  def sumSquareList(Numbers: Int*): Int = Numbers.map((x: Int) => x * x).toList.sum;System.out.println("""sumSquareList: (Numbers: Int*)Int""")}
  
 
   
   
 

}
