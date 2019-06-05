package com.stuart.first

import org.scalatest.{FunSpec, Matchers}

class FactorialSpec extends FunSpec with Matchers {
  describe("factorial operation") {
    it("returns 1 for input 0") {
      Main.factorial(0) shouldBe 1
    }
    it("returns 1 for input 1") {
      Main.factorial(1) shouldBe 1
    }
    it("returns 120 for input 5") {
      Main.factorial(1) shouldBe 1
    }

  }
}
