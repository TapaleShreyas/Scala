package scala.pattern.matching

object MatchOnType {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 

	println("Match for type");$skip(260); 
	
	def matchType(x: Any) = x match {
		case _ : String =>	println("Type is String")
		case _ : Int => println("Type is Int")
		case _ : Float => println("Type is Float")
		case _ : Double => println("Type is Double")
		case _ => println("Some other type")
	};System.out.println("""matchType: (x: Any)Unit""");$skip(17); 
	
	matchType(23);$skip(17); 
	matchType(23.0);$skip(22); 
	matchType("Shreyas");$skip(16); 
	matchType('C');$skip(61); 
	
	println("Match for type along with String Interpolation");$skip(296); 
	def typeMatch(x : Any) = x match {
		case _ : String =>	println(s"$x is of type String")
		case _ : Int => println(s"$x is of type Int")
		case _ : Float => println(s"$x is of type Float")
		case _ : Double => println(s"$x is of type Double")
		case _ => println(s"$x is of some other type")
	};System.out.println("""typeMatch: (x: Any)Unit""");$skip(24); 
	
	typeMatch("shreyas");$skip(15); 
	typeMatch(23);$skip(18); 
	typeMatch(63.0f)}
	
}
