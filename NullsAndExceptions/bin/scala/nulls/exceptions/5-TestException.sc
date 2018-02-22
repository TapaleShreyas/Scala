package scala.nulls.exceptions

object TestException {
	  
  val cars = Map("Baleno"->"Maruti Suzuki", ("Swift","Maruti Suzuki"), ("i20","Hundai"))
                                                  //> cars  : scala.collection.immutable.Map[String,String] = Map(Baleno -> Maruti
                                                  //|  Suzuki, Swift -> Maruti Suzuki, i20 -> Hundai)
  
  cars.get("Baleno")                              //> res0: Option[String] = Some(Maruti Suzuki)
  cars.get("i20")                                 //> res1: Option[String] = Some(Hundai)
  cars.get("Dezire")                              //> res2: Option[String] = None
  
  cars("Baleno")                                  //> res3: String = Maruti Suzuki
  cars("i20")                                     //> res4: String = Hundai
  cars("Dezire")                                  //> java.util.NoSuchElementException: key not found: Dezire
                                                  //| 	at scala.collection.MapLike$class.default(MapLike.scala:228)
                                                  //| 	at scala.collection.AbstractMap.default(Map.scala:59)
                                                  //| 	at scala.collection.MapLike$class.apply(MapLike.scala:141)
                                                  //| 	at scala.collection.AbstractMap.apply(Map.scala:59)
                                                  //| 	at scala.nulls.exceptions.TestException$$anonfun$main$1.apply$mcV$sp(sca
                                                  //| la.nulls.exceptions.TestException.scala:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at scala.nulls.exceptions.TestException$.main(scala.nulls.exceptions.Tes
                                                  //| tException.scala:3)
                                                  //| 	at scala.nulls.exceptions.TestException.main(scala.nulls.exceptions.Test
                                                  //| Exception.scala)
  
}