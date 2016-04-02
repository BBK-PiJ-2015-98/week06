package week6

object question_16_17 {

  val p = Person( "Jane", "Smile","jane@smile.com")
                                                  //> p  : week6.Person = Person(Jane,Smile,jane@smile.com)
  
  println(p.name)                                 //> Jane
  

}

case class Person(var name: String , var second: String, var contact_information: String) {

}