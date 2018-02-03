package scala.basic.syntax

object VariableArguments {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(158); 
  
  def multiplication(nums: Int*) = {
  	var total = 1;
  	for(n <- nums)
  		total *= n
  	total
  };System.out.println("""multiplication: (nums: Int*)Int""");$skip(29); val res$0 = 
  
  multiplication(4,6,8,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(84); 
  
  def printStrings(strings: String*) = {
  	for(s <- strings)
  		println(s)
  };System.out.println("""printStrings: (strings: String*)Unit""");$skip(50); 
  
  printStrings("ABCD", "WXYZ", "from", "Pune")}
}
