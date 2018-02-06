package scala.traits

trait Animal {
	def eat
}

trait DomesticAnimal extends Animal {
	override def eat = println("Eating from DomesticAnimal trait")
}

trait WildAnimal extends Animal {
	override def eat = println("Eating from WildAnimal trait")
}

// with suppose mock/dummy data for testing purpose
trait MoreWildAnimal extends Animal {
	override def eat = println("Eating from MoreWildAnimal trait")
}

//class Horse extends WildAnimal with DomesticAnimal{
class Horse extends DomesticAnimal with WildAnimal {
	
}




object Trait {
  def main(args: Array[String]){
	  val horse = new Horse
	  horse.eat
	  
	  println("You can do testing with this approach , No need to change core logic or code")
	  val test = new Horse with MoreWildAnimal
	  test.eat
	  
	  println("")
	  println("")
	  println("")
	  println("Method with no implementation is abstract method in scala.")
	  println("In case of extending multiple traits one needs to use extend keyword and others needs to use *with traitName* ")
	  println("The diamond problem is resolve in scala by invoking method from the trait which is at extreme right side of extends")
	  println("Here it is WildAnimal, if you see the line *class Horse extends DomesticAnimal with WildAnimal*  ")
  }
}