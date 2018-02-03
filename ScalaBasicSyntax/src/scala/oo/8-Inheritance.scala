package scala.oo

import java.time.LocalDateTime


class Pet{
 def feed() = {
   "Feeding at:"+LocalDateTime.now
 }
}

class Dog extends Pet{
  override def feed() = {
    "Dog Eating..."
  }
}

class Cat extends Pet{
	def hunt() = {
			println("The Cat Hunts")
	}
	
	//Preventing method feed from being overriden again in subclasses of this class
	override val feed = {
	  "Cat Eating..."
	}
}

object inheritance {
  def main(args: Array[String]){
    val d = new Dog
    println(d.feed)
    
    val c = new Cat
    //You can't access with using parenthesis as because we made it as val in definition
    // c.feed() will give you compiler error
    println(c.feed)
    
    
  }
}