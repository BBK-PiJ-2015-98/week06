package week6

object question_16_17 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 

  val p = Person( "Jane", "Smile","jane@smile.com");System.out.println("""p  : week6.Person = """ + $show(p ));$skip(21); 
  
  println(p.name)}
  

}

case class Person(var name: String , var second: String, var contact_information: String) {

}
