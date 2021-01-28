package com.samples

object IfElse {
  def main(args: Array[String]) {
    var x = 30
    var y = 10
    if (x == 30) {
      y = 7
      if (y == 10) {
        println(" y==10 nha anh long")
      } else {
        println("no khong 10 anh oi")
      }
    }
  }
}