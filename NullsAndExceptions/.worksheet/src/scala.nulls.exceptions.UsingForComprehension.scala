package scala.nulls.exceptions

import scala.util.{Try, Success, Failure}

object UsingForComprehension {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(133); 
  
  val a: String = "4560";System.out.println("""a  : String = """ + $show(a ));$skip(25); 
  val b: String = "3671";System.out.println("""b  : String = """ + $show(b ));$skip(80); 
  
  val result = for {
  	x <- Try{a.toInt}
  	y <- Try{b.toInt}
  } yield x+y;System.out.println("""result  : scala.util.Try[Int] = """ + $show(result ))}
  
  
}
