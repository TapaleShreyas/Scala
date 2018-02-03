
class IntVal(val n: Int){
	def +(m: IntVal) = new IntVal(3)
}

object Scala2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(123); 
  println("Welcome to the Scala worksheet");$skip(16); 
  val a:Int = 3;System.out.println("""a  : Int = """ + $show(a ));$skip(16); 
  val b:Int = 2;System.out.println("""b  : Int = """ + $show(b ));$skip(27); 
  val c:String = "Shreyas";System.out.println("""c  : String = """ + $show(c ));$skip(21); 
  val result = a+b+c;System.out.println("""result  : String = """ + $show(result ));$skip(22); 
  val result1 = c+a+b;System.out.println("""result1  : String = """ + $show(result1 ));$skip(28); 
  
  val c1 = new IntVal(2);System.out.println("""c1  : IntVal = """ + $show(c1 ));$skip(25); 
  val c2 = new IntVal(3);System.out.println("""c2  : IntVal = """ + $show(c2 ));$skip(19); 
  val c3 = c1 + c2;System.out.println("""c3  : IntVal = """ + $show(c3 ));$skip(16); 
 	println(c3.n);$skip(20); 
  val c5 = c1.+(c2);System.out.println("""c5  : IntVal = """ + $show(c5 ));$skip(15); 
	println(c5.n)}
}
