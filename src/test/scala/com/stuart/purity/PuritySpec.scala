package com.stuart.purity

import org.scalacheck.Prop.forAll
import org.scalacheck.{Arbitrary, Properties}

object PuritySpec extends Properties("divisionSpec") {
  val randomNumbers = Arbitrary.arbitrary[Int]
  val randomNumbers2 = Arbitrary.arbitrary[Int]

  property("divide by 1") = forAll(randomNumbers, randomNumbers2) { (q, d) =>
    Purity.divide(q, d) == q / d
  }

  /*property("divide by any") = forAll(randomNumbers, randomNumbers2) { (q, d) =>
    if (d == 0)
      Purity.divideSafe(q, d).isEmpty
    else
      Purity.divideSafe(q, d).contains(q / d)
  }*/

}
