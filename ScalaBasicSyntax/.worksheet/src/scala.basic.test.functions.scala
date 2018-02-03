package scala.basic.test

object functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(153); 
  
  def factorial(n: Int): Int = {
  	var result = 1
  	if(n>0)
  		result = n*factorial(n-1)
  	result
  };System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$0 = 
  factorial(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(222); 
  
  
  
  def DateString(date: String): Boolean = {
  	val year = date.substring(date.lastIndexOf("/")+1)
  	if((year.toInt % 4 == 0 && (year.toInt % 100 != 0)) || (year.toInt % 400 == 0 ))
  		true
  	else
  		false
  };System.out.println("""DateString: (date: String)Boolean""");$skip(27); val res$1 = 
  DateString("11/12/2016");System.out.println("""res1: Boolean = """ + $show(res$1))}
  
}
