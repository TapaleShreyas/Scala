package scala.pattern.matching

object MatchMoreThanOneValue {

	def matchMoreValues(name: String, surName: String) = (name, surName) match {
		case ("ABCD","WXYZ") => println(s"Member is $name $surName")
		case (_,"WXYZ") => println("He/She is member of WXYZ Family")
		case default => println(s"$name $surName is a Member of different family")
	}                                         //> matchMoreValues: (name: String, surName: String)Unit

	matchMoreValues("","WXYZ")                //> He/She is member of WXYZ Family
	matchMoreValues("abc","WXYZ")             //> He/She is member of WXYZ Family
	matchMoreValues("ABCD","WXYZ")            //> Member is ABCD WXYZ
	matchMoreValues("xyz","XYZ")              //> xyz XYZ is a Member of different family
}