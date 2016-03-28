package com.fada21.scala.projecteuler

import com.fada21.scala.template.BaseFlatSpec

class P78Spec extends BaseFlatSpec {

  it should "compute correctly" in {
    List(0, 0, 1, 2, 3, 5, 7, 11, 15, 22) shouldBe (-1 to 8).toList.map(P78.naivePileDivisions)
  }

}
