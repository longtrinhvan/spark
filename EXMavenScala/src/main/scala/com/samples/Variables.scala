package com.samples

import java.io._

class pointVariables(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("Point x location:" + x)
    println("Point y location:" + y)
  }
}
object Variables {
  def main(args: Array[String]) {
    var myVar: Int = 10
    val myVal: String = "Hello Scala"
    var myVar1 = 20
    val myVal1 = "Hello Scala new without datatype declaration";

    println(myVar)
    println(myVal)
    println(myVar1)
    println(myVal1)
    
    val pt = new pointVariables(10,10)
    pt.move(5, 10)
  }
}