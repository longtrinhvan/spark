package com.samples

import java.io._
import Run._
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  //  x = x + 4
  //  y = y + 4
  println("xc:" + xc)
  println("yc:" + yc)
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy

    println("Point x location:" + x)
    println("Point y location:" + y)
  }
}

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {

  var z: Int = zc
  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point z location")
    println("Point y location")
    println("Point z location")
  }
}
object ClassAndObject {

  def main(args: Array[String]) {
    val pt = new Point(10, 20);
    // Move to a new location
    pt.move(2, 3)
    
    val loc = new Location(10,20,15)
    loc.move(10,10,5)
    
     4 times println("anh long ới ợi")
  }
}