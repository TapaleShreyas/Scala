package scala.nulls.exceptions

	

object UseOfOption {
  val opt = Some(1)                               //> opt  : Some[Int] = Some(1)
  val non = None                                  //> non  : None.type = None
  opt.get                                         //> res0: Int = 1
  
	case class Empl(val name: String, val number: Option[String])
  
  val empl1 = new Empl("ABCD", Some("1234567890"))//> empl1  : scala.nulls.exceptions.UseOfOption.Empl = Empl(ABCD,Some(1234567890
                                                  //| ))
  val empl2 = new Empl("ABCD", None)              //> empl2  : scala.nulls.exceptions.UseOfOption.Empl = Empl(ABCD,None)
  
  
  empl1.number.get                                //> res1: String = 1234567890
  empl2.number.getOrElse("No Number")             //> res2: String = No Number
  
  
  def getNumber(emp: Empl) = emp.number match {
  	case Some(n) => n
  	case None => "No Number"
  }                                               //> getNumber: (emp: scala.nulls.exceptions.UseOfOption.Empl)String
  
  getNumber(empl1)                                //> res3: String = 1234567890
}