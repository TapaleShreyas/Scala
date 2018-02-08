package scala.collection.generics

class Animal
class DomesticAnimal extends Animal

class HolderWithoutInheritance[T](val value: T){
	def printType = println(s"Of type $value")
}

class HolderWithInheritance[+T](val value: T){
	def printType = println(s"Of type $value")
}

object Generics {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(344); 
  println("This example is like covariant in java");$skip(47); 
	val h1 = new HolderWithoutInheritance("ABCD");System.out.println("""h1  : scala.collection.generics.HolderWithoutInheritance[String] = """ + $show(h1 ));$skip(60); 
  val h2 = new HolderWithoutInheritance(new DomesticAnimal);System.out.println("""h2  : scala.collection.generics.HolderWithoutInheritance[scala.collection.generics.DomesticAnimal] = """ + $show(h2 ));$skip(87); 
  println("Below line will create problem as class syntax doesnt support inheritance");$skip(120); 
  //val h3: HolderWithoutInheritance[Animal] = h2
  
  
  
  
  val h11 = new HolderWithInheritance(new DomesticAnimal);System.out.println("""h11  : scala.collection.generics.HolderWithInheritance[scala.collection.generics.DomesticAnimal] = """ + $show(h11 ));$skip(96); 
  println("Here it supports Inheritance as it has slightly different class syntax(added [+T])");$skip(47); 
  val h12: HolderWithInheritance[Animal] = h11;System.out.println("""h12  : scala.collection.generics.HolderWithInheritance[scala.collection.generics.Animal] = """ + $show(h12 ))}
  
}
