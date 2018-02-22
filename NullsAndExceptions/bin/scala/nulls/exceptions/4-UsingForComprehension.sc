package scala.nulls.exceptions

import scala.util.{Try, Success, Failure}

object UsingForComprehension {
  
  val a: String = "4560"                          //> a  : String = 4560
  val b: String = "3671"                          //> b  : String = 3671
  
  val result = for {
  	x <- Try{a.toInt}
  	y <- Try{b.toInt}
  } yield x+y                                     //> result  : scala.util.Try[Int] = Success(8231)
  
  
}