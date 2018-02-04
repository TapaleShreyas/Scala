package scala.functional.programming

object FunctionAsData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 

	val square = (n: Int) => n*n;System.out.println("""square  : Int => Int = """ + $show(square ));$skip(30); 
	val cube = (n: Int) => n*n*n;System.out.println("""cube  : Int => Int = """ + $show(cube ));$skip(46); 
	def operation(n: Int, f:(Int) => Int) = f(n);System.out.println("""operation: (n: Int, f: Int => Int)Int""");$skip(21); val res$0 = 
	operation(21, cube);System.out.println("""res0: Int = """ + $show(res$0));$skip(23); val res$1 = 
	operation(21, square);System.out.println("""res1: Int = """ + $show(res$1));$skip(51); 

  
	val areaOfRectangle = (l: Int, w: Int) => l*w;System.out.println("""areaOfRectangle  : (Int, Int) => Int = """ + $show(areaOfRectangle ));$skip(58); 
	val perimeterOfRectangle = (l: Int, w: Int) => 2*( l+w );System.out.println("""perimeterOfRectangle  : (Int, Int) => Int = """ + $show(perimeterOfRectangle ));$skip(67); 
  
  def doOperation(a: Int, b: Int, f:(Int, Int) => Int) = f(a,b);System.out.println("""doOperation: (a: Int, b: Int, f: (Int, Int) => Int)Int""");$skip(42); val res$2 = 
  doOperation(3, 2, perimeterOfRectangle);System.out.println("""res2: Int = """ + $show(res$2));$skip(37); val res$3 = 
  doOperation(3, 2, areaOfRectangle);System.out.println("""res3: Int = """ + $show(res$3))}
  
  
}
