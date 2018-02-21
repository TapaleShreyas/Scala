package scala.nulls.exceptions

	

object UseOfOption {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  val opt = Some(1);System.out.println("""opt  : Some[Int] = """ + $show(opt ));$skip(17); 
  val non = None;System.out.println("""non  : None.type = """ + $show(non ));$skip(10); val res$0 = 
  opt.get
  
	case class Empl(val name: String, val number: Option[String]);System.out.println("""res0: Int = """ + $show(res$0));$skip(120); 
  
  val empl1 = new Empl("ABCD", Some("1234567890"));System.out.println("""empl1  : scala.nulls.exceptions.UseOfOption.Empl = """ + $show(empl1 ));$skip(37); 
  val empl2 = new Empl("ABCD", None);System.out.println("""empl2  : scala.nulls.exceptions.UseOfOption.Empl = """ + $show(empl2 ));$skip(25); val res$1 = 
  
  
  empl1.number.get;System.out.println("""res1: String = """ + $show(res$1));$skip(38); val res$2 = 
  empl2.number.getOrElse("No Number");System.out.println("""res2: String = """ + $show(res$2));$skip(107); 
  
  
  def getNumber(emp: Empl) = emp.number match {
  	case Some(n) => n
  	case None => "No Number"
  };System.out.println("""getNumber: (emp: scala.nulls.exceptions.UseOfOption.Empl)String""");$skip(22); val res$3 = 
  
  getNumber(empl1);System.out.println("""res3: String = """ + $show(res$3))}
}
