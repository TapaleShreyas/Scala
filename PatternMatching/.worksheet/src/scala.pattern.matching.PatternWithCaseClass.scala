package scala.pattern.matching

	case class Details(val panNum: String, val aadharNum: Long)
	case class Employee(name: String, details: Details)

object PatternWithCaseClass {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(233); 
	
	
	val details1 = Details("ABCDEFG012", 123456789456l);System.out.println("""details1  : scala.pattern.matching.Details = """ + $show(details1 ));$skip(53); 
	val details2 = Details("TUVWXYZ789", 789456123123l);System.out.println("""details2  : scala.pattern.matching.Details = """ + $show(details2 ));$skip(42); 
	
  val emp1 = Employee("ABCD", details1);System.out.println("""emp1  : scala.pattern.matching.Employee = """ + $show(emp1 ));$skip(40); 
  val emp2 = Employee("WXYZ", details2);System.out.println("""emp2  : scala.pattern.matching.Employee = """ + $show(emp2 ));$skip(171); 
  
  emp2 match {
  	case Employee("WXYZ", Details("TUVWXYZ789",_)) => println("AAdhar Number is: "+emp2.details.aadharNum)
  	case default => println("default case")
  }}
  
  
}
