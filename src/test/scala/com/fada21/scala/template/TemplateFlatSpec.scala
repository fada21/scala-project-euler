package com.fada21.scala.template

class TemplateFlatSpec extends BaseFlatSpec {

  it should "just pass" in {
    true should be(true)
  }

  it should "detect IllegalStateException exception thrown" in {
    val e = new IllegalStateException
    a[IllegalStateException] should be thrownBy {
      throw e
    }
  }

//  "A failing test" should "just fail" in {
//    false should be(true)
//  }

}
