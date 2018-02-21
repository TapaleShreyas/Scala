package scala.nulls.exceptions

	
case class Empl(val name: String, val number: Option[String])

object UseOfOption {
  val opt = Some(1)
  val non = None
  opt.get
  
  
  val empl1 = new Empl("Shreyas", Some("9890658967"))
  val empl2 = new Empl("Shreyas", None)
  
  
  empl1.number.get
  empl2.number.getOrElse("No Number")
  
  
  def getNumber(emp: Empl) = emp.number match {
  	case Some(n) => n
  	case None => "No Number"
  }
  
  getNumber(empl1)
}
