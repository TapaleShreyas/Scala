package scala.functional.programming

object PartialFunctions {
	def fun(n: Int) = n match {
		case 1 => "One"
		case 2 => "Two"
	}                                         //> fun: (n: Int)String
	
	fun(2)                                    //> res0: String = Two
	
	val p:PartialFunction[Int, String] = {
		case 1 => "One"
		case 2 => "Two"
	}                                         //> p  : PartialFunction[Int,String] = <function1>
  
  p(1)                                            //> res1: String = One
  
}