package scala.pattern.matching

object MatchOnValues {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  
  println("Match on static value");$skip(15); 
  val num = 10;System.out.println("""num  : Int = """ + $show(num ));$skip(148); 
  num match {
  	case 10 => println("Number is Ten")
  	case 20 => println("Number is Twenty")
  	case _ => println("Number is something else")
  };$skip(39); 
  
  println("Match on dynamic value");$skip(12); 
  val a = 5;System.out.println("""a  : Int = """ + $show(a ));$skip(12); 
  val b = 5;System.out.println("""b  : Int = """ + $show(b ));$skip(143); 
  a match {
  	case 10 => println("Number is Ten")
  	case b => println("Number is Five")
  	case _ => println("Number is something else")
  };$skip(62); 
  
  
  println("Match for Even Odd for single digit number");$skip(12); 
  val n = 3;System.out.println("""n  : Int = """ + $show(n ));$skip(173); 
  n match {
		case 0 | 2 | 4 | 6 | 8 => println("Number is Even")
		case 1 | 3 | 5 | 7 | 9 => println("Number is Odd")
		case _ => println("More than one digit number")
  }}
  
}
