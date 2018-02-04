package scala.functional.programming

object TailRecursion {

  println("Without Tail Recursion(Bottom up approach)")
                                                  //> Without Tail Recursion(Bottom up approach)
  def fact(n: Int): Int = {
  	if(n==0)
  		1
  	else
  		n*fact(n-1)
  }                                               //> fact: (n: Int)Int
  fact(3)                                         //> res0: Int = 6
  
  
  def fact1(n: Int): Int = n match {
  	case 0 => 1
  	case m => m*fact(m-1)
  }                                               //> fact1: (n: Int)Int
  fact1(4)                                        //> res1: Int = 24
  
  
  
  println("With Tail Recursion(Top Down approach)")
                                                  //> With Tail Recursion(Top Down approach)
  def facto(n: Int, acc: Int): Int = n match {
  	case 0 => acc
  	case m => facto(m-1, m*acc)
  }                                               //> facto: (n: Int, acc: Int)Int
   facto(3,1)                                     //> res2: Int = 6
  
}