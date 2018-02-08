package scala.collection.lists

object FoldingExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
  
	val list = List(1, 2, 3, 4, 5);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(93); 
	
	def contains[T](lst: List[T], item: T) = lst.foldLeft(false)(
		(a, b) => a||b == item
	);System.out.println("""contains: [T](lst: List[T], item: T)Boolean""");$skip(19); val res$0 = 
  list.contains(3);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(20); val res$1 = 
  list.contains(30);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(91); 
  
  
  def reverse[T](lst: List[T]): List[T] = lst.foldLeft(List[T]())((a, b) =>  b :: a);System.out.println("""reverse: [T](lst: List[T])List[T]""");$skip(16); val res$2 = 
 	reverse(list);System.out.println("""res2: List[Int] = """ + $show(res$2))}
 	
}
