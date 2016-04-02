package week6

// WHY IS THE RETURN FUNCTION IS UNIT INSTEAD OF INT
import com.atomicscala.AtomicTest._

object sum {

  sumSquareList(2) is 4                           //> 4
  sumSquareList(2, 4) is 20                       //> 20

  def sumSquareList(Numbers: Int*): Int = Numbers.map((x: Int) => x * x).toList.sum
                                                  //> sumSquareList: (Numbers: Int*)Int
  
 
   
   
 

}