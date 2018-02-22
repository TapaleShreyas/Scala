package scala.nulls.exceptions

import scala.util.{Try, Success, Failure}

object TryAndCatch {
  
  val x: String = "123"                           //> x  : String = 123
  try {
  	x.toInt
  } catch {
  	case ex => println(ex)
  }                                               //> res0: AnyVal = 123
  
  
  val y: String = "12a3"                          //> y  : String = 12a3
  try {
  	y.toInt
  } catch {
  	case ex => println(ex)
  }                                               //> java.lang.NumberFormatException: For input string: "12a3"
                                                  //| res1: AnyVal = ()
  
  
  //import Try, Success, Failure from scala.util
  val result = Try {y.toInt}                      //> result  : scala.util.Try[Int] = Failure(java.lang.NumberFormatException: For
                                                  //|  input string: "12a3")
  
  // Using attern Matching
  result match {
  	case Success(n) => println(n)
  	case Failure(ex) => println(ex)
  }                                               //> java.lang.NumberFormatException: For input string: "12a3"
  
  
  
  
  
}