package scala.collection.lists

object MapsInScala {
  
	val map1 = Map("A"->1, "B"->2, "C"->3, "D"->4)
                                                  //> map1  : scala.collection.immutable.Map[String,Int] = Map(A -> 1, B -> 2, C -
                                                  //| > 3, D -> 4)
  val map2 = Map(("Z",26), ("W", 23))             //> map2  : scala.collection.immutable.Map[String,Int] = Map(Z -> 26, W -> 23)
	
	val value1 = map1("C")                    //> value1  : Int = 3
	val value2 = map1.get("B")                //> value2  : Option[Int] = Some(2)
  val value3 = map1.contains("F")                 //> value3  : Boolean = false
  val value4 = map1.getOrElse("H", 0)             //> value4  : Int = 0
  
  
  
  val mergeMaps = map1 ++ map2                    //> mergeMaps  : scala.collection.immutable.Map[String,Int] = Map(A -> 1, B -> 2
                                                  //| , C -> 3, W -> 23, D -> 4, Z -> 26)
  
}