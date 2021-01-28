package com.samples

object Loop {
  def main(args: Array[String]) {
    var a = 10
    //An infinite loop
    while (a >= 0) {
      println(" value of a: " + a)
      a = a - 1
    }
  }
}