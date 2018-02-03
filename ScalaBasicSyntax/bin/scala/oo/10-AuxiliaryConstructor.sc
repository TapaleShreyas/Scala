package scala.oo

import java.time.LocalDateTime
import java.time.LocalDate

class Cashflow(val amount: Double, val currency: String, val due: LocalDateTime){
	def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due)
	def this(amount: Double) = this(amount, LocalDateTime.now)
}


object AuxiliaryConstructor {

	val o1 = new Cashflow(100)                //> o1  : scala.oo.Cashflow = scala.oo.Cashflow@2957fcb0
	o1.currency                               //> res0: String = USD
	o1.due                                    //> res1: java.time.LocalDateTime = 2018-01-31T20:46:38.776
	
	val o2 = new Cashflow(20, LocalDateTime.now)
                                                  //> o2  : scala.oo.Cashflow = scala.oo.Cashflow@7f63425a
	o2.currency                               //> res2: String = USD
	o2.due                                    //> res3: java.time.LocalDateTime = 2018-01-31T20:46:38.967
	

  println("Auxiliary Constructor provides an alternative way of providing ")
                                                  //> Auxiliary Constructor provides an alternative way of providing 
  println("effectively default values to some other constructor parameters")
                                                  //> effectively default values to some other constructor parameters
  println("Defaulting a middle parameter")        //> Defaulting a middle parameter
  println("You can do a chain of constructors but there must be a mechanism to call priamry constructor")
                                                  //> You can do a chain of constructors but there must be a mechanism to call pri
                                                  //| amry constructor
}