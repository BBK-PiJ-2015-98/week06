/**
 * 4. Adapt the Family class definition to include class arguments for a mother, father,
 * and a variable number of children. What changes did you have to make? Satisfy the
 * following tests:
 * val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
 * family3.familySize() is 4
 * val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
 * family4.familySize() is 3
 */

import com.atomicscala.AtomicTest._

object third extends App {

  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
   
  family3.familySize is 4

  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  
  family4.familySize is 3
  

}

class FlexibleFamily(Father: String, Mother: String, children: String*) {

  val MF = 2

  def familySize = children.length + MF

  def familylist(): Seq[String] = children

}