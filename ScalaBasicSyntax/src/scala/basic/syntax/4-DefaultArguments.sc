package scala.basic.syntax

object DefaultArguments {

	def someDefault(a: Int, b: Int = 20, c: Int){
		println(s"a=$a, b=$b, c=$c")
	}                                         //> someDefault: (a: Int, b: Int, c: Int)Unit
	
	someDefault(25,10,1)                      //> a=25, b=10, c=1
	
	

	def default(a: Int = 12, b: String = "ABCD", c: Int = 16) = {
		println(s"a:$a, b=$b, c=$c")
	}                                         //> default: (a: Int, b: String, c: Int)Unit
	
	println("default valued parameter should always be at right")
                                                  //> default valued parameter should always be at right
	default()                                 //> a:12, b=ABCD, c=16
	default(10)                               //> a:10, b=ABCD, c=16
	default(10,"b",3)                         //> a:10, b=b, c=3
	//default("ABCD",20)
	
	
	def TwoDefaults(a: String = "WXYZ", b: Int = 200) = {
		println(s"a=$a,	b=$b")
	}                                         //> TwoDefaults: (a: String, b: Int)Unit
	println("default parameter searching always starts from left")
                                                  //> default parameter searching always starts from left
	println("In Below invocation we are passing only 2nd param(Int) but it demands for String")
                                                  //> In Below invocation we are passing only 2nd param(Int) but it demands for St
                                                  //| ring
	//TwoDefaults(23)
	
}