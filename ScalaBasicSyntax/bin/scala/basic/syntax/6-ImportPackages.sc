package scala.basic.syntax

import java.util.List
import java.util.ArrayList
import java.util.concurrent._
import java.util.{Map, HashMap}
import java.util.{Date => UDate}
import java.time.{LocalDate => LDate}

object ImportPackages {
  
  val list = new ArrayList[Int]                   //> list  : java.util.ArrayList[Int] = []
  list.add(4)                                     //> res0: Boolean = true
  
  val udate = new UDate                           //> udate  : java.util.Date = Wed Jan 31 08:25:50 IST 2018
  val ldate = LDate.now                           //> ldate  : java.time.LocalDate = 2018-01-31
  
}