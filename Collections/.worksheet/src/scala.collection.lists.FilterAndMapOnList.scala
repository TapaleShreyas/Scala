package scala.collection.lists

object FilterAndMapOnList {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 
  
  val lst1 = List(
  	List("A", "B"),
  	List("B"),
  	List(2,3,5,6,9)
  );System.out.println("""lst1  : List[List[Any]] = """ + $show(lst1 ));$skip(45); 
  
  val lst2 = List(10, 20, 30, 40, 50, 60);System.out.println("""lst2  : List[Int] = """ + $show(lst2 ));$skip(27); val res$0 = 
 	lst2.filter(n=>n % 4==0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(24); val res$1 = 
  
  lst2.map(n=>n + 5);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(16); val res$2 = 
  lst2.map(_+2);System.out.println("""res2: List[Int] = """ + $show(res$2))}
}
