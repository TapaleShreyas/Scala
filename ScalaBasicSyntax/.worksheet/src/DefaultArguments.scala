object DefaultArguments {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 

	def someDefault(a: Int, b: Int = 20, c: Int){
		println(s"a=$a, b=$b, c=$c")
	};System.out.println("""someDefault: (a: Int, b: Int, c: Int)Unit""");$skip(24); 
	
	someDefault(25,10,1);$skip(106); 
	
	

	def default(a: Int = 12, b: String = "shreyas", c: Int = 16) = {
		println(s"a:$a, b=$b, c=$c")
	};System.out.println("""default: (a: Int, b: String, c: Int)Unit""");$skip(65); 
	
	println("default valued parameter should always be at right");$skip(11); 
	default();$skip(13); 
	default(10);$skip(19); 
	default(10,"b",3)}
}
