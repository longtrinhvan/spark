package com.samples
//private gioi han pham vi trong cung mot lop, lop duoc khai bao trong lop do co the su dung (bien, ham ) do
class Outer {
  class Inner {
    private def f() {
      println("f")
    }
    class InnerMost {
      f() //OK
    }
    (new Inner).f();
  }
  //(new Inner).f()  // Error: f is not accessible
}

// protected cho phep truy cap trong cung class, trong class con ke thua op cha-- gioi han pham vi trong cung package
package p {
  class Super {
    protected def f() {
      println("f")
    }
  }
  class Sub extends Super {
    f()
  }
  class Other {
    //    (new Super).f() // Error: f is not accessible
  }
}

class OuterPublic {
  class InnerPublic {
    def f() {
      println("g")
    }
    class InnerMost{
      f()//OK
    }
  }
  (new InnerPublic).f()// OK because now f() is public
}

object AccessModifies {

}