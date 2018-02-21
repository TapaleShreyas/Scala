package scala.nulls.exceptions

object OptionWithFlatMap {
  
  case class Student(val roll: Int, val name: String, val mark: Option[Float]);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(337); 
  val results = List(
  	Student(101, "ABCD", Some(81.2f)),
  	Student(102, "DEFG", Some(57f)),
  	Student(108, "KLMN", None),
  	Student(117, "WXYZ", None),
  	Student(116, "GHIJ", Some(78f))
  );System.out.println("""results  : List[scala.nulls.exceptions.OptionWithFlatMap.Student] = """ + $show(results ));$skip(42); 
  
  val marks = results.map(s => s.mark);System.out.println("""marks  : List[Option[Float]] = """ + $show(marks ));$skip(46); 
  val getMarks = results.flatMap(s => s.mark);System.out.println("""getMarks  : List[Float] = """ + $show(getMarks ))}
  
}
