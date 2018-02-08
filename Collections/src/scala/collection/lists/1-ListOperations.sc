package scala.collection.lists

object ListOperations {
  println("Default Immutable List")               //> Default Immutable List
  
  val list1 = List("A", "B", "C", "D")            //> list1  : List[String] = List(A, B, C, D)
  
  println("Adding element at start")              //> Adding element at start
  val list2 = "E" :: list1                        //> list2  : List[String] = List(E, A, B, C, D)
  
  val list3 = "W" :: "X" :: "Y" :: "Z" :: Nil     //> list3  : List[String] = List(W, X, Y, Z)
  
  println("Adding element at last")               //> Adding element at last
  val list4 = list3 :+ "V"                        //> list4  : List[String] = List(W, X, Y, Z, V)
  
  
  println("Adding 2 lists of same type")          //> Adding 2 lists of same type
  val list5 = list1 ::: list3                     //> list5  : List[String] = List(A, B, C, D, W, X, Y, Z)
  
  val list6 = List(10, 20, 30, 40)                //> list6  : List[Int] = List(10, 20, 30, 40)
  
  
  println("Adding 2 lists of different type")     //> Adding 2 lists of different type
  println("Produces resultant list with type (Any) ")
                                                  //> Produces resultant list with type (Any) 
  val list7 = list1 ::: list6                     //> list7  : List[Any] = List(A, B, C, D, 10, 20, 30, 40)
  
}