package com.xyz.main.exampleTest

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx:Int, dy:Int): Unit ={
    x = x + dx
    y = y + dy
    println(s"x = ${x}")
    println(s"y = ${y}")
  }
  def printv(): Unit ={
     print("sharkalaka")
  }


}
object PointTest{
  def miao()={
    print("miaomiao ")
  }

  def main(args: Array[String]): Unit = {
    val pt = new Point(3, 3)

    pt.move(3,4)
    printPoint

    def printPoint{
      println("x 的坐标点 : " +  pt.x)
      println("y 的坐标点 : " +  pt.y)
    }
  }
}