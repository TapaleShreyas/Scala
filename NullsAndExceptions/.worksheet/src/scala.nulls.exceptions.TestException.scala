package scala.nulls.exceptions

object TestException {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
	  
  val cars = Map("Baleno"->"Maruti Suzuki", ("Swift","Maruti Suzuki"), ("i20","Hundai"));System.out.println("""cars  : scala.collection.immutable.Map[String,String] = """ + $show(cars ));$skip(24); val res$0 = 
  
  cars.get("Baleno");System.out.println("""res0: Option[String] = """ + $show(res$0));$skip(18); val res$1 = 
  cars.get("i20");System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(21); val res$2 = 
  cars.get("Dezire");System.out.println("""res2: Option[String] = """ + $show(res$2));$skip(20); val res$3 = 
  
  cars("Baleno");System.out.println("""res3: String = """ + $show(res$3));$skip(14); val res$4 = 
  cars("i20");System.out.println("""res4: String = """ + $show(res$4));$skip(17); val res$5 = 
  cars("Dezire");System.out.println("""res5: String = """ + $show(res$5))}
  
}
