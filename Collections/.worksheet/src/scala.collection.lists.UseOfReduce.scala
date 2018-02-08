package scala.collection.lists

object UseOfReduce {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
  
  val lst = List("AB", "CD", "EF", "GH", "IJ");System.out.println("""lst  : List[String] = """ + $show(lst ));$skip(47); 
  
  val concatination = lst.foldLeft("")(_+_);System.out.println("""concatination  : String = """ + $show(concatination ));$skip(35); 
  
  val concat = lst.reduce(_+_);System.out.println("""concat  : String = """ + $show(concat ));$skip(58); 
  println("No need of initial \"\" empty string to pass")}
  
}
