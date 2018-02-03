package scala.basic.syntax

object Functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  
  def square(n: Int) = n*n;System.out.println("""square: (n: Int)Int""");$skip(12); val res$0 = 
  square(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(35); 
  
  println("Anonymous function");$skip(30); 
  val cube= (n: Int) => n*n*n;System.out.println("""cube  : Int => Int = """ + $show(cube ));$skip(10); val res$1 = 
  cube(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(84); 
  
  def addThenMul(a: Int, b: Int)(c: Int) = {
  	val result = a+b
  	result*c
  };System.out.println("""addThenMul: (a: Int, b: Int)(c: Int)Int""");$skip(21); val res$2 = 
  addThenMul(2,4)(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(46); 
  
  def defaultReturnType = println("hello");System.out.println("""defaultReturnType: => Unit""");$skip(255); 
  
  def sillyFunction(n: Int) = {
  		//println("Type Inferencing")
  		//println("Better approach is to specify the return type when declaring method")
  	if(n>0)
  		3
  	else
  		"It Takes Least Common Super Type(Any here) if return type differs"
  };System.out.println("""sillyFunction: (n: Int)Any""");$skip(86); 
  
  
  def fun1() = {
  	println("Return type is Unit here")
  	val result = 2*3
  };System.out.println("""fun1: ()Unit""");$skip(6); 
	fun1;$skip(91); 


  def fun2() = {
  	println("Return type is Int here")
  	val result = 2*3
  	result
  };System.out.println("""fun2: ()Int""");$skip(7); val res$3 = 
  fun2;System.out.println("""res3: Int = """ + $show(res$3))}
}
