package scala.basic.test

object Test {
  
  def factorial(n: Int): Int = {
  	var result = 1
  	if(n>0)
  		result = n*factorial(n-1)
  	result
  }                                               //> factorial: (n: Int)Int
  factorial(5)                                    //> res0: Int = 120
  
  
  
  def DateString(date: String): Boolean = {
  	val year = date.substring(date.lastIndexOf("/")+1)
  	if((year.toInt % 4 == 0 && (year.toInt % 100 != 0)) || (year.toInt % 400 == 0 ))
  		true
  	else
  		false
  }                                               //> DateString: (date: String)Boolean
  DateString("11/12/2016")                        //> res1: Boolean = true
  
}