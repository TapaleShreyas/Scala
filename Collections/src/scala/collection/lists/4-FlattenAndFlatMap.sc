package scala.collection.lists

object FlattenAndFlatMap {
  
  println("Lists of peoples working on different projects")
                                                  //> Lists of peoples working on different projects
  val ls1 = List(
  	List("abcd", "efgh", "ijkl"),
  	List(),
  	List("lmno"),
  	List("pqrs", "tuvw")
  )                                               //> ls1  : List[List[String]] = List(List(abcd, efgh, ijkl), List(), List(lmno),
                                                  //|  List(pqrs, tuvw))
  println("Here flatten converts entire collection into list of strings")
                                                  //> Here flatten converts entire collection into list of strings
  val ls2 = ls1.flatten                           //> ls2  : List[String] = List(abcd, efgh, ijkl, lmno, pqrs, tuvw)
  
  println("First letter capital for each element in List")
                                                  //> First letter capital for each element in List
  val ls3 = ls1.flatten.map(e=>e.capitalize)      //> ls3  : List[String] = List(Abcd, Efgh, Ijkl, Lmno, Pqrs, Tuvw)

  println("Doing same as above using underscore _")
                                                  //> Doing same as above using underscore _
  val ls4 = ls1.flatten.map(_.capitalize)         //> ls4  : List[String] = List(Abcd, Efgh, Ijkl, Lmno, Pqrs, Tuvw)
  
 
 	println("Use of flatMap instead of doing flatten and map")
                                                  //> Use of flatMap instead of doing flatten and map
  val ls5 = ls1.flatMap(l => l.map(e => e.capitalize))
                                                  //> ls5  : List[String] = List(Abcd, Efgh, Ijkl, Lmno, Pqrs, Tuvw)
  println("Same can be achieve using underscore _")
                                                  //> Same can be achieve using underscore _
  val ls6 = ls1.flatMap(_.map(_.capitalize))      //> ls6  : List[String] = List(Abcd, Efgh, Ijkl, Lmno, Pqrs, Tuvw)
}