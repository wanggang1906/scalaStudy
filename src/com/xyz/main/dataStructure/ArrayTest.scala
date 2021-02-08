package com.xyz.main.dataStructure

import scala.Array.{concat, range}
/**
 * 笔记
 *
 * */

object ArrayTest {
  def main(args: Array[String]): Unit = {
    // 通过 Array创建
    var arr1 = Array(1, 2, 2)
    println(arr1)
    var arr1_1 = new Array[String](4)
    arr1_1(0) = "44"
    println(arr1_1)
    // 通过range 创建
    var arr2 = range(1, 6)
    // 合并
    var arr3 = concat(arr1, arr2)
    // 遍历
    for (x <- arr1) {
      println(x)
    }
    print("------")

    // 获取元素
    print(arr3(3))

  }
}
