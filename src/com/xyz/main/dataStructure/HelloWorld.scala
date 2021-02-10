package com.xyz.main.dataStructure

import java.util.Date
import scala.Array.ofDim

/**
 * 笔记
 * Object可以直接在main方法中访问
 * 构造器
 * */
class myClass(name:String,age:String){
  // 重写构造器

  // class中的main方法是一个普通放啊，
  // 静态方法属于类

}
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
    // array为同质、数据可变、长度不可变的集合
    // 同质 = array中的元素数据类型相同，若不同则array类型为一个超类，any类型
    val arr1 = Array(12, "12")
    for (i <- arr1)
      println(i)
    println("arr1的类型为：", arr1.getClass.getSimpleName)

    val arr = List(1, 4, "3333", 13, 4234)
    for (i <- arr) {
      println(i)
    }
  }

  def forTest3() = {
    val arr = List(1, 4, "3333", 13, 4234)
    for (i <- arr if i.isInstanceOf[Int]){
      // 是否为Int的一个实例，判断对象是否属于某个给定的类
      // asInstanceOf可以将引用转换为子类的引用
      println("输出Int类型的数据：",i)
         }
  }

  def forTest4() = {
    var x = 0
    val arr = List(1, 4, 3, 4, 1.1, 156, 156, 4816, 812, 12, 151, 2, 1112, 15, 1, 2, 1, 51, 32, 15, 64, 9, 2, 1, 321, 5, 15, 4234)
    // yield 记住每次迭代中的有关值，并逐一存入到一个数组中
    var retVal = for { x <- arr if x < 12 } yield x // 取出arr中 <12 的值，并存在数组中
    for (a <- retVal) {
      println("retVal中的值为：",a)
    }
  }

  /**
   * 可变参数
   * @param n
   * @param xs
   */
  def fun1(n: Int, xs: Int*) = {
    println("可直接赋值的参数：",n,"\n")
    println("可迭代对象为：\n")
    for (i <- xs) {
      println(i)
    }
  }

  /**
   * 递归
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
    // forTest4()

    // seq
    var seq:Seq[Int] = Seq(1,3,4,2,0)
    fun1(n=2,xs = seq)

    val pattern = "\\d".r
    val str = "juhsu1938234jsidj"
    print(pattern.findFirstIn(str))

  }

}
