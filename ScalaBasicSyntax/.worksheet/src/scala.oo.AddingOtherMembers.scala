package scala.oo

import java.time.LocalDateTime

class Cashflow1(val amount: Double, val currency: String, val due: LocalDateTime){
	def this(amount: Double, due: LocalDateTime) = this(amount, "RS", due)
	def this(amount: Double) = this(amount,LocalDateTime.now)
	
	val settle = due.toLocalDate.plusDays(4)
	private lazy val processedAt = LocalDateTime.now
	
	def rollForward() = {
		val retVal = new Cashflow1(amount, currency, due.plusDays(2))
		retVal.processedAt
		retVal
	}
}

object AddingOtherMembers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(541); 
 val o1 = new Cashflow1(200.0);System.out.println("""o1  : scala.oo.Cashflow1 = """ + $show(o1 ));$skip(11); val res$0 = 
 o1.amount;System.out.println("""res0: Double = """ + $show(res$0));$skip(13); val res$1 = 
 o1.currency;System.out.println("""res1: String = """ + $show(res$1));$skip(8); val res$2 = 
 o1.due;System.out.println("""res2: java.time.LocalDateTime = """ + $show(res$2));$skip(11); val res$3 = 
 o1.settle;System.out.println("""res3: java.time.LocalDate = """ + $show(res$3));$skip(29); 
 val res3 = o1.rollForward();System.out.println("""res3  : scala.oo.Cashflow1 = """ + $show(res3 ));$skip(20); 
 Thread.sleep(1000);$skip(13); val res$4 = 
 res3.settle;System.out.println("""res4: java.time.LocalDate = """ + $show(res$4));$skip(13); val res$5 = 
 res3.amount;System.out.println("""res5: Double = """ + $show(res$5));$skip(15); val res$6 = 
 res3.currency;System.out.println("""res6: String = """ + $show(res$6));$skip(10); val res$7 = 
 res3.due;System.out.println("""res7: java.time.LocalDateTime = """ + $show(res$7))}
}
