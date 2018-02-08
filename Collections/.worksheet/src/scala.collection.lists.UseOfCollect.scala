package scala.collection.lists

object UseOfCollect {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(136); 
  
  val lst = List(
  	List("abcd", "efgh"),
  	List("ijkl"),
  	List(12, 45)
  );System.out.println("""lst  : List[List[Any]] = """ + $show(lst ));$skip(28); 
  
  val lst1 = lst.flatten;System.out.println("""lst1  : List[Any] = """ + $show(lst1 ));$skip(100); 
  
  println("Here capitalize method will not work as we are having Int elements also in the list");$skip(139); 
  //val lst2 = lst.flatten.map(s=> s.capitalize)
  
  println("To eleminate such error in this case we will make use of collect in scala");$skip(68); 
  println("And will convert partial function into entire function");$skip(106); 
  println("collect will check for string if it is then it will capitalize that otherwise it will ignore");$skip(86); 
  
  val lst3 = lst.flatten.collect(
  	{
  		case s: String => s.capitalize
  	}
  );System.out.println("""lst3  : List[String] = """ + $show(lst3 ));$skip(72); 
  
  val lst4 = lst.flatten.collect(
  	{
  		case e: Int => e
  	}
  );System.out.println("""lst4  : List[Int] = """ + $show(lst4 ));$skip(106); 
 
  val lst5 = lst.flatten.collect(
  	{
  		case s: String => s.capitalize
  		case e: Int => e
  	}
  );System.out.println("""lst5  : List[Any] = """ + $show(lst5 ))}
}
