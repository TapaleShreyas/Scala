package scala.basic.syntax

object VariableArguments {
  
  def multiplication(nums: Int*) = {
  	var total = 1;
  	for(n <- nums)
  		total *= n
  	total
  }                                               //> multiplication: (nums: Int*)Int
  
  multiplication(4,6,8,2)                         //> res0: Int = 384
  
  def printStrings(strings: String*) = {
  	for(s <- strings)
  		println(s)
  }                                               //> printStrings: (strings: String*)Unit
  
  printStrings("ABCD", "WXYZ", "from", "Pune")    //> ABCD
                                                  //| WXYZ
                                                  //| from
                                                  //| Pune
}