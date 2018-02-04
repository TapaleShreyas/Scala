package scala.pattern.matching

import java.util.ArrayList

object MatchOnCondition {
	  
  case class Salary(empID: Int, salary: Double)
  case class Employees(ID: Int, name: String, birthYear: Int, earning: Salary);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(251); 
  
  val sal1 = Salary(234,45000d);System.out.println("""sal1  : scala.pattern.matching.MatchOnCondition.Salary = """ + $show(sal1 ));$skip(32); 
  val sal2 = Salary(645,20000d);System.out.println("""sal2  : scala.pattern.matching.MatchOnCondition.Salary = """ + $show(sal2 ));$skip(32); 
  val sal3 = Salary(768,50000d);System.out.println("""sal3  : scala.pattern.matching.MatchOnCondition.Salary = """ + $show(sal3 ));$skip(51); 
  
  val emp1 = Employees(234, "ABCD", 1992, sal1);System.out.println("""emp1  : scala.pattern.matching.MatchOnCondition.Employees = """ + $show(emp1 ));$skip(48); 
  val emp2 = Employees(645, "JKLM", 1989, sal2);System.out.println("""emp2  : scala.pattern.matching.MatchOnCondition.Employees = """ + $show(emp2 ));$skip(48); 
  val emp3 = Employees(768, "WXYZ", 1985, sal3);System.out.println("""emp3  : scala.pattern.matching.MatchOnCondition.Employees = """ + $show(emp3 ));$skip(178); 
                                                  
                                                  
  println("Find the employees with birth year 1992 and salary is > 25000");$skip(59); 
  
  var empList: List[Employees] = List(emp1, emp2, emp3);System.out.println("""empList  : List[scala.pattern.matching.MatchOnCondition.Employees] = """ + $show(empList ));$skip(249); 
  empList.foreach(emp => {
	  	emp match {
	  		case Employees(_,_, 1992, Salary(_,s)) if(s > 25000d) => println(emp.name + " is matching specified condition")
	  		case _ => println(emp.name + " is Not matching specified condition")
	  	}
  	}
  )}
  
  
}
