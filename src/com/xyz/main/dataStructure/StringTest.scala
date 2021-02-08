package com.xyz.main.dataStructure

/**
 * 字符串练习
 */
object StringTest {

  def main(args: Array[String]): Unit = {
    var str1 = "10000"
    str1 += 'f'
    println(str1)

    val str2 = str1.concat("v")
    println(str2)


  }
}
