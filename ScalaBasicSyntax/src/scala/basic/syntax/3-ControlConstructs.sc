package scala.basic.syntax

object ControlConstructs {
  
  println("Indirect object reference")            //> Indirect object reference
  
  for(n <- 1 to 5)
  	println(n)                                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
  	
  for(n <- 1.to(5))
  println(n)                                      //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
}