package scala.functional.programming

object PartialFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(131); 
	def fun(n: Int) = n match {
		case 1 => "One"
		case 2 => "Two"
	};System.out.println("""fun: (n: Int)String""");$skip(10); val res$0 = 
	
	fun(2);System.out.println("""res0: String = """ + $show(res$0));$skip(81); 
	
	val p:PartialFunction[Int, String] = {
		case 1 => "One"
		case 2 => "Two"
	};System.out.println("""p  : PartialFunction[Int,String] = """ + $show(p ));$skip(10); val res$1 = 
  
  p(1);System.out.println("""res1: String = """ + $show(res$1))}
  
}
