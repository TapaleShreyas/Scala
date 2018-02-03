package scala.basic.syntax

class IntVal(val n: Int){
	def +(m: IntVal) = new IntVal(3)
}

object OperatorOverloading {
  val a:Int = 3                                   //> a  : Int = 3
  val b:Int = 2                                   //> b  : Int = 2
  val c:String = "ABCD"                           //> c  : String = ABCD
  val result = a+b+c                              //> result  : String = 5ABCD
  val result1 = c+a+b                             //> result1  : String = ABCD32
  
  val c1 = new IntVal(2)                          //> c1  : scala.basic.syntax.IntVal = scala.basic.syntax.IntVal@34ce8af7
  val c2 = new IntVal(3)                          //> c2  : scala.basic.syntax.IntVal = scala.basic.syntax.IntVal@b684286
  val c3 = c1 + c2                                //> c3  : scala.basic.syntax.IntVal = scala.basic.syntax.IntVal@880ec60
 	println(c3.n)                             //> 3
  val c5 = c1.+(c2)                               //> c5  : scala.basic.syntax.IntVal = scala.basic.syntax.IntVal@3f3afe78
	println(c5.n)                             //> 3
}