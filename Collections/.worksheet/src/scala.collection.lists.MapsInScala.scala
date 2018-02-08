package scala.collection.lists

object MapsInScala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 
  
	val map1 = Map("A"->1, "B"->2, "C"->3, "D"->4);System.out.println("""map1  : scala.collection.immutable.Map[String,Int] = """ + $show(map1 ));$skip(38); 
  val map2 = Map(("Z",26), ("W", 23));System.out.println("""map2  : scala.collection.immutable.Map[String,Int] = """ + $show(map2 ));$skip(26); 
	
	val value1 = map1("C");System.out.println("""value1  : Int = """ + $show(value1 ));$skip(28); 
	val value2 = map1.get("B");System.out.println("""value2  : Option[Int] = """ + $show(value2 ));$skip(34); 
  val value3 = map1.contains("F");System.out.println("""value3  : Boolean = """ + $show(value3 ));$skip(38); 
  val value4 = map1.getOrElse("H", 0);System.out.println("""value4  : Int = """ + $show(value4 ));$skip(40); 
  
  
  
  val mergeMaps = map1 ++ map2;System.out.println("""mergeMaps  : scala.collection.immutable.Map[String,Int] = """ + $show(mergeMaps ))}
  
}
