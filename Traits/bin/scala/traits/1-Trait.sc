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


object Trait {
  println("Welcome to the Scala worksheet")
  
  val w = new WildAnimal
  w.eat
}