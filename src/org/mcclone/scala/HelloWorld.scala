package org.mcclone.scala

/**
  * Created by mcclone on 17-9-24.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello world".concat(String.valueOf(add2(1, 2))))
    println(multiplier(2))
    var myArray = Array("1", "2")
    for (i <- myArray) {
      println(i)
    }

    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }

  def add(a: Int, b: Int): Int = {
    a + b
  }

  val add2: (Int, Int) => Int = (a: Int, b: Int) => a + b

  var factor = 3
  val multiplier: (Int) => Int = (i: Int) => i * factor
}

trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any): Boolean =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}