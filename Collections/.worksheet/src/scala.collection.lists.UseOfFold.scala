package scala.collection.lists

object UseOfFold {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  
  val lst = List(4, 6, 2, 7);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(62); 
	val addition = lst.foldLeft(0)(
		(acc, next) => acc+next
	);System.out.println("""addition  : Int = """ + $show(addition ));$skip(49); 
	val addition1 = lst.foldLeft(0)(
		( _ + _ )
	);System.out.println("""addition1  : Int = """ + $show(addition1 ));$skip(56); 
	
	
  val add = lst.foldRight(0)(
  	(a, b) => a+b
  );System.out.println("""add  : Int = """ + $show(add ));$skip(46); 
  val add1 = lst.foldRight(0)(
  	( _+_ )
  );System.out.println("""add1  : Int = """ + $show(add1 ));$skip(44); 
  
  val strList = List("A", "M", "L" ,"Z");System.out.println("""strList  : List[String] = """ + $show(strList ));$skip(58); 
  val concat = strList.foldLeft("")(
  	(a, b) => a+b
  );System.out.println("""concat  : String = """ + $show(concat ));$skip(70); 
  
  
  
  val reverse = strList.foldRight("")(
  	(a, b) => b+a
  );System.out.println("""reverse  : String = """ + $show(reverse ))}
}
