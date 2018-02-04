package scala.functional.programming

object TailRecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(117); 

  println("Without Tail Recursion(Bottom up approach)");$skip(74); 
  def fact(n: Int): Int = {
  	if(n==0)
  		1
  	else
  		n*fact(n-1)
  };System.out.println("""fact: (n: Int)Int""");$skip(10); val res$0 = 
  fact(3);System.out.println("""res0: Int = """ + $show(res$0));$skip(87); 
  
  
  def fact1(n: Int): Int = n match {
  	case 0 => 1
  	case m => m*fact(m-1)
  };System.out.println("""fact1: (n: Int)Int""");$skip(11); val res$1 = 
  fact1(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(61); 
  
  
  
  println("With Tail Recursion(Top Down approach)");$skip(99); 
  def facto(n: Int, acc: Int): Int = n match {
  	case 0 => acc
  	case m => facto(m-1, m*acc)
  };System.out.println("""facto: (n: Int, acc: Int)Int""");$skip(14); val res$2 = 
   facto(3,1);System.out.println("""res2: Int = """ + $show(res$2))}
  
}
