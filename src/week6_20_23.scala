import com.atomicscala.AtomicTest._

/**
 * 
 * Functions as Objects
20. Working from your solution to the exercise above, add a comma between each number.
Satisfy the following test:
str is "1,2,3,4,"

WHAT DOES THIS QUESTION MEAN

21. Create an anonymous function that calculates age in dog years (by multiplying years
by 7). Assign it to a val and then call your function.
Satisfy the following test:
val dogYears = // Your function here
dogYears(10) is 70

22. Create a Vector and append the result of dogYears to a String for each value in
the Vector.
Satisfy the following test:
var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(/* Fill this in */)
s is "7 35 49 56 "

23. Create an anonymous function to square a list of numbers. Call the function for every
element in a Vector, using foreach.
Satisfy the following test:
var s = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach(/* Fill this in */)
s is "1 4 25 9 49 "
 */

 object week6_20_23 extends App {
  
  //def AddComma(): String= {}
  
  var c="1234"
  var str=""
  (c) foreach(ch=> str+=ch+ ",") 
   str is "1,2,3,4,"
 
  
   val v = Vector(1, 5, 7, 8)
   var  s= ""
   (v) foreach (x=> s+=x*7 + " ")
   s is "7 35 49 56 " 
   
  
   val dogYears= (y: Int)=> y*7
    
   dogYears(10) is 70
  
   
   
   val numbers = Vector(1, 2, 5, 3, 7)
   var  S= ""
   (numbers) foreach (x=> S+=x*x + " ")
   S is "1 4 25 9 49 "


}