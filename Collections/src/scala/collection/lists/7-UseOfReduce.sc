package scala.collection.lists

object UseOfReduce {
  
  val lst = List("AB", "CD", "EF", "GH", "IJ")    //> lst  : List[String] = List(AB, CD, EF, GH, IJ)
  
  val concatination = lst.foldLeft("")(_+_)       //> concatination  : String = ABCDEFGHIJ
  
  val concat = lst.reduce(_+_)                    //> concat  : String = ABCDEFGHIJ
  println("No need of initial \"\" empty string to pass")
                                                  //> No need of initial "" empty string to pass
  
}