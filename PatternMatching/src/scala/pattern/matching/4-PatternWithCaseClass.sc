package scala.pattern.matching

	case class Details(val panNum: String, val aadharNum: Long)
	case class Employee(name: String, details: Details)

object PatternWithCaseClass {
	
	
	val details1 = Details("ABCDEFG012", 123456789456l)
                                                  //> details1  : scala.pattern.matching.Details = Details(ABCDEFG012,123456789456
                                                  //| )
	val details2 = Details("TUVWXYZ789", 789456123123l)
                                                  //> details2  : scala.pattern.matching.Details = Details(TUVWXYZ789,789456123123
                                                  //| )
	
  val emp1 = Employee("ABCD", details1)           //> emp1  : scala.pattern.matching.Employee = Employee(ABCD,Details(ABCDEFG012,1
                                                  //| 23456789456))
  val emp2 = Employee("WXYZ", details2)           //> emp2  : scala.pattern.matching.Employee = Employee(WXYZ,Details(TUVWXYZ789,7
                                                  //| 89456123123))
  
  emp2 match {
  	case Employee("WXYZ", Details("TUVWXYZ789",_)) => println("AAdhar Number is: "+emp2.details.aadharNum)
  	case default => println("default case")
  }                                               //> AAdhar Number is: 789456123123
  
  
}