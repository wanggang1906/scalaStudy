package com.xyz.main.dataStructure

/**
 * @Author jx
 * @Date 2019/11/7 11:58
 */
object SetDemo {
  def test1(): Unit = {
    val set1 = Set(1, 2)
    println(s"set = ${set1}")
    var set2 = Set(0, 4, 23)
    val set3 = set1 ++ set2
    println(s"set3 = ${set3}")

    val list = for (x <- 1 to 10 if x % 3 != 0) yield x * 2 * x
    println(s"list = ${list}")
  }

  def level(s: Int) = s match {
    case n if n > 30 => "fff"
    case _ => "fffsdf"
  }

  def main(args: Array[String]): Unit = {

  }

}
