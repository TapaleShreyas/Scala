package scala.basic.syntax

import java.util.List
import java.util.ArrayList
import java.util.concurrent._
import java.util.{Map, HashMap}
import java.util.{Date => UDate}
import java.time.{LocalDate => LDate}

object ImportPackages {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(269); 
  
  val list = new ArrayList[Int];System.out.println("""list  : java.util.ArrayList[Int] = """ + $show(list ));$skip(14); val res$0 = 
  list.add(4);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(27); 
  
  val udate = new UDate;System.out.println("""udate  : java.util.Date = """ + $show(udate ));$skip(24); 
  val ldate = LDate.now;System.out.println("""ldate  : java.time.LocalDate = """ + $show(ldate ))}
  
}
