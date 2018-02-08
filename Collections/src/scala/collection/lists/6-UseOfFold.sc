package scala.collection.lists

object UseOfFold {
  
  val lst = List(4, 6, 2, 7)                      //> lst  : List[Int] = List(4, 6, 2, 7)
	val addition = lst.foldLeft(0)(
		(acc, next) => acc+next
	)                                         //> addition  : Int = 19
	val addition1 = lst.foldLeft(0)(
		( _ + _ )
	)                                         //> addition1  : Int = 19
	
	
  val add = lst.foldRight(0)(
  	(a, b) => a+b
  )                                               //> add  : Int = 19
  val add1 = lst.foldRight(0)(
  	( _+_ )
  )                                               //> add1  : Int = 19
  
  val strList = List("A", "M", "L" ,"Z")          //> strList  : List[String] = List(A, M, L, Z)
  val concat = strList.foldLeft("")(
  	(a, b) => a+b
  )                                               //> concat  : String = AMLZ
  
  
  
  val reverse = strList.foldRight("")(
  	(a, b) => b+a
  )                                               //> reverse  : String = ZLMA
}