package scala.collection.lists

object ListOperations {
	 val lst1 = List("A", 1, "B", 2)          //> lst1  : List[Any] = List(A, 1, B, 2)
	 val lst2 = List(10, 20, 30, 40, 50)      //> lst2  : List[Int] = List(10, 20, 30, 40, 50)
	 val lst3 = List(110, 120, 130, 140, 50)  //> lst3  : List[Int] = List(110, 120, 130, 140, 50)
	 val lst4 = List("W", "X", "Y", "Z")      //> lst4  : List[String] = List(W, X, Y, Z)
	 
	 lst4.tail                                //> res0: List[String] = List(X, Y, Z)
	 lst4.head                                //> res1: String = W
	 
	 println("List with pattern matching")    //> List with pattern matching
	 
	 
	 def printList[T](lst: List[T]): Unit = lst match {
	 	case Nil => println("list Ends")
	 	case h :: t => println(h)
	 			printList(t)
	 }                                        //> printList: [T](lst: List[T])Unit
	 
	 printList(lst3)                          //> 110
                                                  //| 120
                                                  //| 130
                                                  //| 140
                                                  //| 50
                                                  //| list Ends
	 
	 
	 def matchList[T](lst: List[T])	= lst match {
	 	case List() => println("List i empty")
	 	case List(_) => println("List of single element")
	 	case List("A",_) => println("List of 2 elements, first element is A")
	 	case List(_,_) => println("List of 2 elements")
	 	case _ => println("default case")
	 }                                        //> matchList: [T](lst: List[T])Unit
 
	 matchList(List("A", 3))                  //> List of 2 elements, first element is A
	 matchList(lst3)                          //> default case
	 matchList(List(2,4))                     //> List of 2 elements
 
}