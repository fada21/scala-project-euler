package com.fada21.scala.template

class TemplateFeatureSpec extends BaseFeatureSpec {

  feature("BDD tests are ready to go") {

    info(
      """As a developer
        |I want to write some BDD tests
        |So that I can make my app more robust
      """.stripMargin)

    scenario("Some passing tests implemented") {

      Given(" I have good feature implementation")
      val e = new IllegalStateException()

      When("I run the test")
      val thrown = intercept[IllegalStateException](throw e)

      Then("I get it passed")
      thrown shouldBe an[IllegalStateException]
    }

//    scenario("Some failing tests implemented") {
//
//      Given("I have wrong feature implementation")
//      val expectedTrue = false
//
//      Then("I get it failed")
//      assert(expectedTrue)
//    }

    scenario("Some scenario prepared for implementation") {

      Given("I have something to test")
      When("I write some test")
      And("Run my tests")
      Then("Test can be run")
      And("Results are printed on the console")
      pending
    }

    scenario("Some planned scenario outlined")(pending)
  }

}
