package scala.oo

import java.time.LocalDateTime
import java.time.LocalDate

class Cashflow(val amount: Double, val currency: String, val due: LocalDateTime){
	def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due)
	def this(amount: Double) = this(amount, LocalDateTime.now)
}


object AuxiliaryConstructor {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(354); 

	val o1 = new Cashflow(100);System.out.println("""o1  : scala.oo.Cashflow = """ + $show(o1 ));$skip(13); val res$0 = 
	o1.currency;System.out.println("""res0: String = """ + $show(res$0));$skip(8); val res$1 = 
	o1.due;System.out.println("""res1: java.time.LocalDateTime = """ + $show(res$1));$skip(48); 
	
	val o2 = new Cashflow(20, LocalDateTime.now);System.out.println("""o2  : scala.oo.Cashflow = """ + $show(o2 ));$skip(13); val res$2 = 
	o2.currency;System.out.println("""res2: String = """ + $show(res$2));$skip(8); val res$3 = 
	o2.due;System.out.println("""res3: java.time.LocalDateTime = """ + $show(res$3));$skip(81); 
	

  println("Auxiliary Constructor provides an alternative way of providing ");$skip(77); 
  println("effectively default values to some other constructor parameters");$skip(43); 
  println("Defaulting a middle parameter");$skip(106); 
  println("You can do a chain of constructors but there must be a mechanism to call priamry constructor")}
}
