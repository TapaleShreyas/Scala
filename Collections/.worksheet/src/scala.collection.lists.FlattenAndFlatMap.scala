package scala.collection.lists

object FlattenAndFlatMap {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(121); 
  
  println("Lists of peoples working on different projects");$skip(107); 
  val ls1 = List(
  	List("abcd", "efgh", "ijkl"),
  	List(),
  	List("lmno"),
  	List("pqrs", "tuvw")
  );System.out.println("""ls1  : List[List[String]] = """ + $show(ls1 ));$skip(74); 
  println("Here flatten converts entire collection into list of strings");$skip(24); 
  val ls2 = ls1.flatten;System.out.println("""ls2  : List[String] = """ + $show(ls2 ));$skip(62); 
  
  println("First letter capital for each element in List");$skip(45); 
  val ls3 = ls1.flatten.map(e=>e.capitalize);System.out.println("""ls3  : List[String] = """ + $show(ls3 ));$skip(53); 

  println("Doing same as above using underscore _");$skip(42); 
  val ls4 = ls1.flatten.map(_.capitalize);System.out.println("""ls4  : List[String] = """ + $show(ls4 ));$skip(66); 
  
 
 	println("Use of flatMap instead of doing flatten and map");$skip(55); 
  val ls5 = ls1.flatMap(l => l.map(e => e.capitalize));System.out.println("""ls5  : List[String] = """ + $show(ls5 ));$skip(52); 
  println("Same can be achieve using underscore _");$skip(45); 
  val ls6 = ls1.flatMap(_.map(_.capitalize));System.out.println("""ls6  : List[String] = """ + $show(ls6 ))}
}
