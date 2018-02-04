package scala.functional.programming

class Test1 {
  def factorial(n: Int): Int = {
    def fact(n: Int, acc: Int): Int = n match {
      case 0 => acc
      case m => fact(m-1, acc*m)
    }
    fact(n, 1)
  }
}
object Test1 {
  def main(args: Array[String]){
    val t = new Test1
    println("Factorial is: "+t.factorial(4))
  }
}