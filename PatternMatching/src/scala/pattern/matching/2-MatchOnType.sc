package scala.pattern.matching

object MatchOnType {

	println("Match for type")                 //> Match for type
	
	def matchType(x: Any) = x match {
		case _ : String =>	println("Type is String")
		case _ : Int => println("Type is Int")
		case _ : Float => println("Type is Float")
		case _ : Double => println("Type is Double")
		case _ => println("Some other type")
	}                                         //> matchType: (x: Any)Unit
	
	matchType(23)                             //> Type is Int
	matchType(23.0)                           //> Type is Double
	matchType("Shreyas")                      //> Type is String
	matchType('C')                            //> Some other type
	
	println("Match for type along with String Interpolation")
                                                  //> Match for type along with String Interpolation
	def typeMatch(x : Any) = x match {
		case _ : String =>	println(s"$x is of type String")
		case _ : Int => println(s"$x is of type Int")
		case _ : Float => println(s"$x is of type Float")
		case _ : Double => println(s"$x is of type Double")
		case _ => println(s"$x is of some other type")
	}                                         //> typeMatch: (x: Any)Unit
	
	typeMatch("shreyas")                      //> shreyas is of type String
	typeMatch(23)                             //> 23 is of type Int
	typeMatch(63.0f)                          //> 63.0 is of type Float
	
}