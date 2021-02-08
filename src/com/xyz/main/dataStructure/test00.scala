package com.xyz.main.dataStructure

/**
 * @author: wg
 * @software: IntelliJ IDEA
 * @file: test00.scala
 * @time: 2021/2/8 14:03
 * @Project : scalaStudy
 * Destribute : scala测试
 * */
class test00 {

  def main(args: Array[String]): Unit = {
    println("hello,world")
    println(10)
    println(10 * 2)
    println(BigInt.probablePrime(100, scala.util.Random))
    exampleFor()


    def exampleFor(): Unit = {
      // 几种for
      for (i <- 1 to 10) // 没有for(i:i<n;i++)的形式，没有++操作
        println(i)

      // 高级for
      // 变量<-表达式 提供一个生成器，每个生成器带一个守卫
      for (i <- 1 to 10; j <- 1 to 5)
        println(i, j)

      // for推导式,生成一个向量vector
      println(for (i <- 1 to 10) yield i % 3)

    }

  }
}
