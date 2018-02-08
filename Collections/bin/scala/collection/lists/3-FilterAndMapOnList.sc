package scala.collection.lists

object FilterAndMapOnList {
  
  val lst1 = List(
  	List("A", "B"),
  	List("B"),
  	List(2,3,5,6,9)
  )                                               //> lst1  : List[List[Any]] = List(List(A, B), List(B), List(2, 3, 5, 6, 9))
  
  val lst2 = List(10, 20, 30, 40, 50, 60)         //> lst2  : List[Int] = List(10, 20, 30, 40, 50, 60)
 	lst2.filter(n=>n % 4==0)                  //> res0: List[Int] = List(20, 40, 60)
  
  lst2.map(n=>n + 5)                              //> res1: List[Int] = List(15, 25, 35, 45, 55, 65)
  lst2.map(_+2)                                   //> res2: List[Int] = List(12, 22, 32, 42, 52, 62)
}