package scala.functional.programming

object FunctionsAndMethods {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); val res$0 = 
  "hello";System.out.println("""res0: String("hello") = """ + $show(res$0));$skip(23); 
	def fun(n: Int) = n+n;System.out.println("""fun: (n: Int)Int""")}
	
  
}

object TestObject {
	val fun2 = (n: Int) => FunctionsAndMethods.fun(n)
}
