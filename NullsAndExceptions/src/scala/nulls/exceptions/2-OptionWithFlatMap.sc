package scala.nulls.exceptions

object OptionWithFlatMap {
  
  case class Student(val roll: Int, val name: String, val mark: Option[Float])
  val results = List(
  	Student(101, "ABCD", Some(81.2f)),
  	Student(102, "DEFG", Some(57f)),
  	Student(108, "KLMN", None),
  	Student(117, "WXYZ", None),
  	Student(116, "GHIJ", Some(78f))
  )                                               //> results  : List[scala.nulls.exceptions.OptionWithFlatMap.Student] = List(Stu
                                                  //| dent(101,ABCD,Some(81.2)), Student(102,DEFG,Some(57.0)), Student(108,KLMN,No
                                                  //| ne), Student(117,WXYZ,None), Student(116,GHIJ,Some(78.0)))
  
  val marks = results.map(s => s.mark)            //> marks  : List[Option[Float]] = List(Some(81.2), Some(57.0), None, None, Some
                                                  //| (78.0))
  val getMarks = results.flatMap(s => s.mark)     //> getMarks  : List[Float] = List(81.2, 57.0, 78.0)
  
}