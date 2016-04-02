
import com.atomicscala.AtomicTest._
/**
 * Case Classes
 * 15. Create a case class to represent a Person in an address book, complete with Strings
 * for the name and a String for contact information. Satisfy the following tests:
 * val p = Person("Jane", "Smile", "jane@smile.com")
 * p.first is "Jane"
 * p.last is "Smile"
 * p.email is "jane@smile.com"
 *
 *
 * 16. Create some Person objects. Put the Person objects in a Vector. Satisfy the
 * following tests:
 * Page 4
 * val people = Vector(
 * Person("Jane","Smile","jane@smile.com"),
 * Person("Ron","House","ron@house.com"),
 * Person("Sally","Dove","sally@dove.com"))
 * people(0) is "Person(Jane,Smile,jane@smile.com)"
 * people(1) is "Person(Ron,House,ron@house.com)"
 * people(2) is "Person(Sally,Dove,sally@dove.com)"
 */





object personclass extends App {
    

  case class Person(var first: String, var last: String, var email: String) {
  }
  

  val P = Person(first = "Jane", last = "Smile", email = "jane@smile.com")
  
  P.first is "Jane"
  
 P.last is "Smile"
  
 P.email is "jane@smile.com"
 
 val people = Vector(
                      Person("Jane","Smile","jane@smile.com"),
                      Person("Ron","House","ron@house.com"),
                      Person("Sally","Dove","sally@dove.com"))
                      
                      
 people(0) is "Person(Jane,Smile,jane@smile.com)"
 people(1) is "Person(Ron,House,ron@house.com)"
 people(2) is "Person(Sally,Dove,sally@dove.com)"

  

}