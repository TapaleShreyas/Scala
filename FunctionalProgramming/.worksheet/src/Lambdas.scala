object Lambdas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  
	val areaOfCircle = (radius: Float) => 3.14f * radius * radius;System.out.println("""areaOfCircle  : Float => Float = """ + $show(areaOfCircle ));$skip(18); val res$0 = 
 	areaOfCircle(5);System.out.println("""res0: Float = """ + $show(res$0));$skip(24); val res$1 = 
 	areaOfCircle.apply(5);System.out.println("""res1: Float = """ + $show(res$1));$skip(63); 
	println("Behind the scene .apply method is getting executed")}
	  
}
