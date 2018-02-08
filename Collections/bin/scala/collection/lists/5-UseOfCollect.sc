package scala.collection.lists

object UseOfCollect {
  
  val lst = List(
  	List("abcd", "efgh"),
  	List("ijkl"),
  	List(12, 45)
  )                                               //> lst  : List[List[Any]] = List(List(abcd, efgh), List(ijkl), List(12, 45))
  
  val lst1 = lst.flatten                          //> lst1  : List[Any] = List(abcd, efgh, ijkl, 12, 45)
  
  println("Here capitalize method will not work as we are having Int elements also in the list")
                                                  //> Here capitalize method will not work as we are having Int elements also in t
                                                  //| he list
  //val lst2 = lst.flatten.map(s=> s.capitalize)
  
  println("To eleminate such error in this case we will make use of collect in scala")
                                                  //> To eleminate such error in this case we will make use of collect in scala
  println("And will convert partial function into entire function")
                                                  //> And will convert partial function into entire function
  println("collect will check for string if it is then it will capitalize that otherwise it will ignore")
                                                  //> collect will check for string if it is then it will capitalize that otherwis
                                                  //| e it will ignore
  
  val lst3 = lst.flatten.collect(
  	{
  		case s: String => s.capitalize
  	}
  )                                               //> lst3  : List[String] = List(Abcd, Efgh, Ijkl)
  
  val lst4 = lst.flatten.collect(
  	{
  		case e: Int => e
  	}
  )                                               //> lst4  : List[Int] = List(12, 45)
 
  val lst5 = lst.flatten.collect(
  	{
  		case s: String => s.capitalize
  		case e: Int => e
  	}
  )                                               //> lst5  : List[Any] = List(Abcd, Efgh, Ijkl, 12, 45)
}