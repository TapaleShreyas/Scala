package scala.basic.syntax

object Functions {
  
  def square(n: Int) = n*n                        //> square: (n: Int)Int
  square(4)                                       //> res0: Int = 16
  
  println("Anonymous function")                   //> Anonymous function
  val cube= (n: Int) => n*n*n                     //> cube  : Int => Int = <function1>
  cube(3)                                         //> res1: Int = 27
  
  def addThenMul(a: Int, b: Int)(c: Int) = {
  	val result = a+b
  	result*c
  }                                               //> addThenMul: (a: Int, b: Int)(c: Int)Int
  addThenMul(2,4)(3)                              //> res2: Int = 18
  
  def defaultReturnType = println("hello")        //> defaultReturnType: => Unit
  
  def sillyFunction(n: Int) = {
  		//println("Type Inferencing")
  		//println("Better approach is to specify the return type when declaring method")
  	if(n>0)
  		3
  	else
  		"It Takes Least Common Super Type(Any here) if return type differs"
  }                                               //> sillyFunction: (n: Int)Any
  
  
  def fun1() = {
  	println("Return type is Unit here")
  	val result = 2*3
  }                                               //> fun1: ()Unit
	fun1                                      //> Return type is Unit here


  def fun2() = {
  	println("Return type is Int here")
  	val result = 2*3
  	result
  }                                               //> fun2: ()Int
  fun2                                            //> Return type is Int here
                                                  //| res3: Int = 6
}