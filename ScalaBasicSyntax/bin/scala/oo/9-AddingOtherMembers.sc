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

object AddingOtherMembers {
 val o1 = new Cashflow1(200.0)                    //> o1  : scala.oo.Cashflow1 = scala.oo.Cashflow1@2957fcb0
 o1.amount                                        //> res0: Double = 200.0
 o1.currency                                      //> res1: String = RS
 o1.due                                           //> res2: java.time.LocalDateTime = 2018-01-31T22:17:01.516
 o1.settle                                        //> res3: java.time.LocalDate = 2018-02-04
 val res3 = o1.rollForward()                      //> res3  : scala.oo.Cashflow1 = scala.oo.Cashflow1@7f63425a
 Thread.sleep(1000)
 res3.settle                                      //> res4: java.time.LocalDate = 2018-02-06
 res3.amount                                      //> res5: Double = 200.0
 res3.currency                                    //> res6: String = RS
 res3.due                                         //> res7: java.time.LocalDateTime = 2018-02-02T22:17:01.516
}