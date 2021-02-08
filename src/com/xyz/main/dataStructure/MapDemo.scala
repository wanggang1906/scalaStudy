package com.xyz.main.dataStructure

import scala.collection.mutable

object MapDemo {
  def main(args: Array[String]): Unit = {
    var a = Map("f" -> 1, "j" -> 3)

    a += ("g" -> 89)
    println(s"A = ${a}")

    val b: mutable.Map[String, Int] = mutable.Map()
    b.put("dff", 4)
    println(s"b.getClass = ${b.getClass}")

    val map = a ++ b
    println(s"map.getClass = ${map.getClass}")
    println(s"map = ${map}")

    val map1 = map - "f"
    println(s"map1 = ${map1}")
    println(map1.get("f").getOrElse(99999))
    println(s"map1.get('f') = ${map1.get("f")}")
  }
}
