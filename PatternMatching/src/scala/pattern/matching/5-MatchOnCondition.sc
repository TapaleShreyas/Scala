package scala.pattern.matching

import java.util.ArrayList

object MatchOnCondition {
	  
  case class Salary(empID: Int, salary: Double)
  case class Employees(ID: Int, name: String, birthYear: Int, earning: Salary)
  
  val sal1 = Salary(234,45000d)                   //> sal1  : scala.pattern.matching.MatchOnCondition.Salary = Salary(234,45000.0)
                                                  //| 
  val sal2 = Salary(645,20000d)                   //> sal2  : scala.pattern.matching.MatchOnCondition.Salary = Salary(645,20000.0)
                                                  //| 
  val sal3 = Salary(768,50000d)                   //> sal3  : scala.pattern.matching.MatchOnCondition.Salary = Salary(768,50000.0)
                                                  //| 
  
  val emp1 = Employees(234, "ABCD", 1992, sal1)   //> emp1  : scala.pattern.matching.MatchOnCondition.Employees = Employees(234,AB
                                                  //| CD,1992,Salary(234,45000.0))
  val emp2 = Employees(645, "JKLM", 1989, sal2)   //> emp2  : scala.pattern.matching.MatchOnCondition.Employees = Employees(645,JK
                                                  //| LM,1989,Salary(645,20000.0))
  val emp3 = Employees(768, "WXYZ", 1985, sal3)   //> emp3  : scala.pattern.matching.MatchOnCondition.Employees = Employees(768,WX
                                                  //| YZ,1985,Salary(768,50000.0))
                                                  
                                                  
  println("Find the employees with birth year 1992 and salary is > 25000")
                                                  //> Find the employees with birth year 1992 and salary is > 25000
  
  var empList: List[Employees] = List(emp1, emp2, emp3)
                                                  //> empList  : List[scala.pattern.matching.MatchOnCondition.Employees] = List(Em
                                                  //| ployees(234,ABCD,1992,Salary(234,45000.0)), Employees(645,JKLM,1989,Salary(6
                                                  //| 45,20000.0)), Employees(768,WXYZ,1985,Salary(768,50000.0)))
  empList.foreach(emp => {
	  	emp match {
	  		case Employees(_,_, 1992, Salary(_,s)) if(s > 25000d) => println(emp.name + " is matching specified condition")
	  		case _ => println(emp.name + " is Not matching specified condition")
	  	}
  	}
  )                                               //> ABCD is matching specified condition
                                                  //| JKLM is Not matching specified condition
                                                  //| WXYZ is Not matching specified condition
  
  
}