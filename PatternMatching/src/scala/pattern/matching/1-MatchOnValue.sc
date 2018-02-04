package scala.pattern.matching

object MatchOnValue {
  println("Match on static value")
                                                  //> Match on static value
  val num = 10                                    //> num  : Int = 10
  num match {
  	case 10 => println("Number is Ten")
  	case 20 => println("Number is Twenty")
  	case _ => println("Number is something else")
  }                                               //> Number is Ten
  
  println("Match on dynamic value")               //> Match on dynamic value
  val a = 5                                       //> a  : Int = 5
  val b = 5                                       //> b  : Int = 5
  a match {
  	case 10 => println("Number is Ten")
  	case b => println("Number is Five")
  	case _ => println("Number is something else")
  }                                               //> Number is Five
  
  
  println("Match for Even Odd for single digit number")
                                                  //> Match for Even Odd for single digit number
  val n = 3                                       //> n  : Int = 3
  n match {
		case 0 | 2 | 4 | 6 | 8 => println("Number is Even")
		case 1 | 3 | 5 | 7 | 9 => println("Number is Odd")
		case default => println("More than one digit number")
  }                                               //> Number is Odd
  
}