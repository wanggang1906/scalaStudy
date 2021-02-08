package com.xyz.main.dataStructure

import java.util.Date
import scala.Array.ofDim

/**
 * 笔记
 * Object可以直接在main方法中访问
 * */
object HelloWorld {

  // 方法名(参数): 方法返回类型
  def forTest1() = {
    for (t <- 1 to 10; s <- 1 to t) { // [1,10)
      print(t + "*" + s + "=" + (t * s) + " ")
      if (s == t) {
        println()
      }
    }
  }

  def forTest2() = {
    val arr = List(1, 4, "3333", 13, 4234)
    for (i <- arr) {
      println(i)
    }
  }

  def forTest3() = {
    val arr = List(1, 4, "3333", 13, 4234)
    for (i <- arr
         if i.isInstanceOf[Int]) {
      println(i)
    }
  }

  def forTest4() = {
    var x = 0
    val arr = List(1, 4, 3, 4, 1.1, 156, 156, 4816, 812, 12, 151, 2, 1112, 15, 1, 2, 1, 51, 32, 15, 64, 9, 2, 1, 321, 5, 15, 4234)
    var retVal = for {x <- arr
                      if x < 12
                      } yield x

    for (a <- retVal) {
      println(a)
    }
  }

  def m(x: Int) = {
    x + 2
  }


  /**
   * 可变参数
   *
   * @param n
   * @param xs
   */
  def fun1(n: Int, xs: Int*) = {
    println(n)
    for (i <- xs) {
      println(i)
    }
  }

  /**
   * 可指定参数   fun2(b=1,a=33)
   *
   * @param a
   * @param b
   */
  def fun2(a: Int, b: Int): Unit = {
    println(a)
    println(b)
  }

  /**
   * 递归
   *
   * @param n
   * @return
   */
  def fun3(n: Int): Int = {
    if (n <= 1)
      1
    else
      n * fun3(n - 1)
  }

  /**
   * 默认参数
   * fun4(7)   -> 17
   * fun4(7,3) -> 10
   *
   * @param x
   * @param y
   */
  def fun4(x: Int, y: Int = 10) = {
    println(x + y)
  }

  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply(f: Int => String, v: Int) = f(v)

  def layout[sA](x: sA): String = "[" + x.toString() + "]"

  def func4(a: Int, b: Int) = {
    if (a == 1) {
      a + b
    } else {
      "-----"
    }
  }

  var inc = (x: Int) => x + 1

  def func5(a: Int) = {
    def subFunc1() = "aaaaaaa"

    def subFunc2() = "bbbbbbb"
  }

  /**
   * 偏函数
   */
  def log(data: Date, msg: String) = {
    println(data + "--------- " + msg)
  }

  var logXXX = log(new Date, _: String)

  def runLog() = {
    val date = new Date()
    val logWith = log(date, _: String)

    log(date, "ddddd")
    logWith("jjjjjjjjjjj")
  }

  /**
   * 柯里化
   */
  def add1(a: Int, b: Int) = a + b

  def add2(a: Int)(b: Int) = a + b

  def runAdd2(): Unit = {
    val res = add2(8)(_)
    val res2 = res(2)
    print(res2)
  }

  var myMatrix = ofDim[Int](3, 3)

  def listTest(): Unit = {
    val list1 = List(2, 4, 234, 3)

    println("list1:" + list1)
    val list1_1 = list1.::(3)
    println("list1_1:" + list1_1)

    val list2 = 2 :: (4 :: Nil)
    val list3 = 54 :: (89 :: Nil)
    println("list2:" + list2)
    println("list3:" + list3)

    val list4 = list2 ::: list3
    val list5 = list2.:::(list3)
    println("list4:" + list4)
    println("list5:" + list5)

    val list6 = list1 :+ 5
    println("list6:" + list6)

    val list7 = 4 +: list1
    println(s"list7 = ${list7}")

    val n = 3
    val list8 = n :: list1
    println(s"list8 = ${list8}")

    val sb = new StringBuilder
    list1.addString(sb, sep = ",")
    println(s"sb = ${sb}")

    val distinctList = list1.distinct
    println(s"distinctList = ${distinctList}")
  }


  def main(args: Array[String]): Unit = {
    // 主方法测试
    forTest2()

    val pattern = "\\d".r
    val str = "juhsu1938234jsidj"
    print(pattern.findFirstIn(str))

  }

}
