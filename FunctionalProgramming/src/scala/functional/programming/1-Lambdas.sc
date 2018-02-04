object Lambdas {
  
	val areaOfCircle = (radius: Float) => 3.14f * radius * radius
                                                  //> areaOfCircle  : Float => Float = <function1>
 	areaOfCircle(5)                           //> res0: Float = 78.5
 	areaOfCircle.apply(5)                     //> res1: Float = 78.5
	println("Behind the scene .apply method is getting executed")
                                                  //> Behind the scene .apply method is getting executed
	  
}