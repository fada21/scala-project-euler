package com.fada21.scala.template

import org.scalatest.{Inside, Inspectors, Matchers, OptionValues}

/**
  * http://www.scalatest.org/user_guide
  */
trait BaseSpec extends Matchers with OptionValues with Inside with Inspectors {}
