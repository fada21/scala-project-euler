package com.fada21.scala.template

class TemplateFunSpec extends BaseFunSpec {

  describe("A test") {

    describe("when good") {
      it("should just pass") {
        true should be(true)
      }

      it("should detect IllegalStateException exception thrown") {
        val e = new IllegalStateException
        val thrown = intercept[IllegalStateException](throw e)
        thrown should be(an[IllegalStateException])
      }
    }

//    describe("when wrong") {
//      it("should just fail") {
//        false shouldBe true
//      }
//    }
  }

}
