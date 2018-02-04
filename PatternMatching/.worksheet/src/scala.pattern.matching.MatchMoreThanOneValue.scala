package scala.pattern.matching

object MatchMoreThanOneValue {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(348); 

	def matchMoreValues(name: String, surName: String) = (name, surName) match {
		case ("ABCD","WXYZ") => println(s"Member is $name $surName")
		case (_,"WXYZ") => println("He/She is member of WXYZ Family")
		case default => println(s"$name $surName is a Member of different family")
	};System.out.println("""matchMoreValues: (name: String, surName: String)Unit""");$skip(29); 

	matchMoreValues("","WXYZ");$skip(31); 
	matchMoreValues("abc","WXYZ");$skip(32); 
	matchMoreValues("ABCD","WXYZ");$skip(30); 
	matchMoreValues("xyz","XYZ")}
}
