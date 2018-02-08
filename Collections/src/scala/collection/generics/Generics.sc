package scala.collection.generics

class Animal
class DomesticAnimal extends Animal

class HolderWithoutInheritance[T](val value: T){
	def printType = println(s"Of type $value")
}

class HolderWithInheritance[+T](val value: T){
	def printType = println(s"Of type $value")
}

object Generics {
  println("This example is like covariant in java")
                                                  //> This example is like covariant in java
	val h1 = new HolderWithoutInheritance("ABCD")
                                                  //> h1  : scala.collection.generics.HolderWithoutInheritance[String] = scala.col
                                                  //| lection.generics.HolderWithoutInheritance@5594a1b5
  val h2 = new HolderWithoutInheritance(new DomesticAnimal)
                                                  //> h2  : scala.collection.generics.HolderWithoutInheritance[scala.collection.ge
                                                  //| nerics.DomesticAnimal] = scala.collection.generics.HolderWithoutInheritance@
                                                  //| 6a5fc7f7
  println("Below line will create problem as class syntax doesnt support inheritance")
                                                  //> Below line will create problem as class syntax doesnt support inheritance
  //val h3: HolderWithoutInheritance[Animal] = h2
  
  
  
  
  val h11 = new HolderWithInheritance(new DomesticAnimal)
                                                  //> h11  : scala.collection.generics.HolderWithInheritance[scala.collection.gene
                                                  //| rics.DomesticAnimal] = scala.collection.generics.HolderWithInheritance@3b6eb
                                                  //| 2ec
  println("Here it supports Inheritance as it has slightly different class syntax(added [+T])")
                                                  //> Here it supports Inheritance as it has slightly different class syntax(added
                                                  //|  [+T])
  val h12: HolderWithInheritance[Animal] = h11    //> h12  : scala.collection.generics.HolderWithInheritance[scala.collection.gene
                                                  //| rics.Animal] = scala.collection.generics.HolderWithInheritance@3b6eb2ec
  
}