object Scala1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(30); 
  
  def square(n: Int) = n*n;System.out.println("""square: (n: Int)Int""");$skip(12); val res$0 = 
  square(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(33); 
  
  val cube= (n: Int) => n*n*n;System.out.println("""cube  : Int => Int = """ + $show(cube ));$skip(10); val res$1 = 
  cube(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(78); 
  
  def addThenMul(a: Int)(b: Int) = {
  	val result = a+b
  	result+a*b
  };System.out.println("""addThenMul: (a: Int)(b: Int)Int""");$skip(19); val res$2 = 
  addThenMul(2)(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(46); 
  
  def defaultReturnType = println("hello");System.out.println("""defaultReturnType: => Unit""");$skip(270); 
  
  def sillyFunction(n: Int) = {
  		//println("Type Inferencing")
  		//println("Type Inferencing, Better approach is to specify the return type when declaring method")
  	if(n>0)
  		3
  	else
  		"Takes Least Common Super Type(Any here) if return type differs"
  };System.out.println("""sillyFunction: (n: Int)Any""")}
  
  
}
