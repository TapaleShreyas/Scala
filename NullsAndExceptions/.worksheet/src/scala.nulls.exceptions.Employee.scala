package scala.nulls.exceptions

	
case class Employee(val name: String, val number: Option[Int])

object UseOfOption {
  val opt = Some(1)
  val non = None
  opt.get
  
  
  
  
}
