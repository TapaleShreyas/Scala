package scala.nulls.exceptions

object TestException2 {
  
	val laptops = Map(
											("HP 15q-BU004TU 2017",26999.00),
											("HP 15q-BU005TU 2017",21950.00),
											("HP 14q-BU005TU 2017",30989.00),
											("HP 15-BW098AU",19899.00)
										)
                                                  //> laptops  : scala.collection.immutable.Map[String,Double] = Map(HP 15q-BU004T
                                                  //| U 2017 -> 26999.0, HP 15q-BU005TU 2017 -> 21950.0, HP 14q-BU005TU 2017 -> 30
                                                  //| 989.0, HP 15-BW098AU -> 19899.0)
  val list = List("HP 15-BW098AU","HP 14q-BU005TU 2017","HP 15q-BU005TU 2017")
                                                  //> list  : List[String] = List(HP 15-BW098AU, HP 14q-BU005TU 2017, HP 15q-BU005
                                                  //| TU 2017)
  val lst = "HP 15q-BU004TU 2017" :: list         //> lst  : List[String] = List(HP 15q-BU004TU 2017, HP 15-BW098AU, HP 14q-BU005T
                                                  //| U 2017, HP 15q-BU005TU 2017)
  
  lst.map(x => laptops.get(x))                    //> res0: List[Option[Double]] = List(Some(26999.0), Some(19899.0), Some(30989.0
                                                  //| ), Some(21950.0))
 	lst.flatMap(x => laptops.get(x))          //> res1: List[Double] = List(26999.0, 19899.0, 30989.0, 21950.0)
  
}