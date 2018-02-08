package scala.collection.lists

object FoldingExamples {
  
	val list = List(1, 2, 3, 4, 5)            //> list  : List[Int] = List(1, 2, 3, 4, 5)
	
	def contains[T](lst: List[T], item: T) = lst.foldLeft(false)(
		(a, b) => a||b == item
	)                                         //> contains: [T](lst: List[T], item: T)Boolean
  list.contains(3)                                //> res0: Boolean = true
  list.contains(30)                               //> res1: Boolean = false
  
  
  def reverse[T](lst: List[T]): List[T] = lst.foldLeft(List[T]())((a, b) =>  b :: a)
                                                  //> reverse: [T](lst: List[T])List[T]
 	reverse(list)                             //> res2: List[Int] = List(5, 4, 3, 2, 1)
 	
}