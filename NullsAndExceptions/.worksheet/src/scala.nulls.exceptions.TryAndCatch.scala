package scala.nulls.exceptions

import scala.util.{Try, Success, Failure}

object TryAndCatch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(122); 
  
  val x: String = "123";System.out.println("""x  : String = """ + $show(x ));$skip(61); val res$0 = 
  try {
  	x.toInt
  } catch {
  	case ex => println(ex)
  };System.out.println("""res0: AnyVal = """ + $show(res$0));$skip(31); 
  
  
  val y: String = "12a3";System.out.println("""y  : String = """ + $show(y ));$skip(61); val res$1 = 
  try {
  	y.toInt
  } catch {
  	case ex => println(ex)
  };System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(84); 
  
  
  //import Try, Success, Failure from scala.util
  val result = Try {y.toInt};System.out.println("""result  : scala.util.Try[Int] = """ + $show(result ));$skip(119); 
  
  // Using attern Matching
  result match {
  	case Success(n) => println(n)
  	case Failure(ex) => println(ex)
  }}
  
  
  
  
  
}
