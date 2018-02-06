package scala.traits

trait Animal {
	println("Method with no implementation is abstract method in scala.")
	def eat
}

trait DomesticAnimal extends Animal {
	override def eat = println("Eating from DomesticAnimal trait")
}

trait WildAnimal extends Animal {
	override def eat = println("Eating from WildAnimal trait")
}

class Horse extends DomesticAnimal with WildAnimal {
println("We extends one trait and others are used using *with traitName* ")
	
}


object Trait {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(515); 
  println("Welcome to the Scala worksheet");$skip(28); 
  
  val w = new WildAnimal;System.out.println("""w  : <error> = """ + $show(w ));$skip(8); val res$0 = 
  w.eat;System.out.println("""res0: <error> = """ + $show(res$0))}
}
