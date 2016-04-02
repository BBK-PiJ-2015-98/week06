
import com.atomicscala.AtomicTest._

/**
 * 5. Write a method that squares a variable argument list of numbers and returns the
 * sum. Satisfy the following tests:
 * squareThem(2) is 4
 * squareThem(2, 4) is 20
 * squareThem(1, 2, 4) is 21
 */

object week6_5 extends App {
  
   	 squareThem(2) is 4
     squareThem(2, 4) is 20
    squareThem(1, 2, 4) is 21

   def  squareThem(Numbers: Int*):Int = Numbers.map((x: Int) => x * x).toList.sum

}

/**
 * 
 //var SAM = 0

  //def sumSquareList( Numbers_List: List): Int = for (Num <- Numbers) SAM = SAM + Num

   def sumSquareList (Numbers: Seq[Int]):Int =Numbers.map((x: Int) => x * x).toList.sum
   
   println (sumSquareList(Numbers))
  
   
  
                       
}
 
 */

