package com.xyz.main.dataStructure

object ListTest {

  def test1(): Unit = {
    val list1 = List(2, 4, 234, 3)
    println("list1:" + list1)
    var list1_1 = list1.::(3)
    println("list1_1:" + list1_1)


    val list2 = 2 :: (4 :: Nil)
    val list3 = 54 :: (89 :: Nil)
    println("list2:" + list2)
    println("list3:" + list3)

    val list4 = list2 ::: list3
    val list5 = list3.:::(list3)
    println("list4:" + list4)
    println("list5:" + list5)
  }

  /**
   * 填充元素
   */
  def test2() = {
    var site = List.fill(4)("xiaoxiao")
    println(s"site = ${site}")
  }


  def main(args: Array[String]): Unit = {
    val site = "zhang" :: ("zhao" :: ("ming" :: Nil))
    println(s"site.apply(1) = ${site.apply(1)}")

    val map = site.groupBy(v => v.charAt(0))
    println(s"map = ${map}")

    val site2 = "zhao" :: site
    val seq = site :+ "333"
    println(s"seq = ${seq}")
    val distinct = site2.distinct
    println(s"distinct = ${distinct}")

    val list1 = List(34, "fds")
    println(s"list1 = ${list1}")
  }

}
