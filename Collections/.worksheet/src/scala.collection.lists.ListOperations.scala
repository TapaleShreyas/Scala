package scala.collection.lists

object ListOperations {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
	 val lst1 = List("A", 1, "B", 2);System.out.println("""lst1  : List[Any] = """ + $show(lst1 ));$skip(38); 
	 val lst2 = List(10, 20, 30, 40, 50);System.out.println("""lst2  : List[Int] = """ + $show(lst2 ));$skip(42); 
	 val lst3 = List(110, 120, 130, 140, 50);System.out.println("""lst3  : List[Int] = """ + $show(lst3 ));$skip(38); 
	 val lst4 = List("W", "X", "Y", "Z");System.out.println("""lst4  : List[String] = """ + $show(lst4 ));$skip(15); val res$0 = 
	 
	 lst4.tail;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(12); val res$1 = 
	 lst4.head;System.out.println("""res1: String = """ + $show(res$1));$skip(43); 
	 
	 println("List with pattern matching");$skip(146); 
	 
	 
	 def printList[T](lst: List[T]): Unit = lst match {
	 	case Nil => println("list Ends")
	 	case h :: t => println(h)
	 			printList(t)
	 };System.out.println("""printList: [T](lst: List[T])Unit""");$skip(21); 
	 
	 printList(lst3);$skip(313); 
	 
	 
	 def matchList[T](lst: List[T])	= lst match {
	 	case List() => println("List i empty")
	 	case List(_) => println("List of single element")
	 	case List("A",_) => println("List of 2 elements, first element is A")
	 	case List(_,_) => println("List of 2 elements")
	 	case _ => println("default case")
	 };System.out.println("""matchList: [T](lst: List[T])Unit""");$skip(28); 
 
	 matchList(List("A", 3));$skip(18); 
	 matchList(lst3);$skip(23); 
	 matchList(List(2,4))}
 
}
