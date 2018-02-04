package scala.functional.programming

object FunctionAsData {

	val square = (n: Int) => n*n              //> square  : Int => Int = <function1>
	val cube = (n: Int) => n*n*n              //> cube  : Int => Int = <function1>
	def operation(n: Int, f:(Int) => Int) = f(n)
                                                  //> operation: (n: Int, f: Int => Int)Int
	operation(21, cube)                       //> res0: Int = 9261
	operation(21, square)                     //> res1: Int = 441

  
	val areaOfRectangle = (l: Int, w: Int) => l*w
                                                  //> areaOfRectangle  : (Int, Int) => Int = <function2>
	val perimeterOfRectangle = (l: Int, w: Int) => 2*( l+w )
                                                  //> perimeterOfRectangle  : (Int, Int) => Int = <function2>
  
  def doOperation(a: Int, b: Int, f:(Int, Int) => Int) = f(a,b)
                                                  //> doOperation: (a: Int, b: Int, f: (Int, Int) => Int)Int
  doOperation(3, 2, perimeterOfRectangle)         //> res2: Int = 10
  doOperation(3, 2, areaOfRectangle)              //> res3: Int = 6
  
  
}