package scala.nulls.exceptions

object TestException2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(263); 
  
	val laptops = Map(
											("HP 15q-BU004TU 2017",26999.00),
											("HP 15q-BU005TU 2017",21950.00),
											("HP 14q-BU005TU 2017",30989.00),
											("HP 15-BW098AU",19899.00)
										);System.out.println("""laptops  : scala.collection.immutable.Map[String,Double] = """ + $show(laptops ));$skip(79); 
  val list = List("HP 15-BW098AU","HP 14q-BU005TU 2017","HP 15q-BU005TU 2017");System.out.println("""list  : List[String] = """ + $show(list ));$skip(42); 
  val lst = "HP 15q-BU004TU 2017" :: list;System.out.println("""lst  : List[String] = """ + $show(lst ));$skip(34); val res$0 = 
  
  lst.map(x => laptops.get(x));System.out.println("""res0: List[Option[Double]] = """ + $show(res$0));$skip(35); val res$1 = 
 	lst.flatMap(x => laptops.get(x));System.out.println("""res1: List[Double] = """ + $show(res$1))}
  
}
