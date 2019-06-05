package com.stuart.first

import org.scalatest.{FunSpec, Matchers}

class AnagramSpec extends FunSpec with Matchers {

  describe("anagram method") {
    it("returns no mach ") {
      Main.anagram("diaper", List("hello", "world", "zombies", "pants")) shouldBe Nil
    }
    it("returns two anagrams") {
      Main.anagram("master", List("stream", "pigeon", "maters")) shouldBe List(
        "stream",
        "maters"
      )
    }
    it("does not detect anagram subsets") {
      Main.anagram("good", List("dog", "goody")) shouldBe List()
    }

    it("detects anagram") {
      Main.anagram("listen", List("enlists", "google", "inlets", "banana")) shouldBe List(
        "inlets"
      )
    }

    it("detects three anagrams") {
      Main.anagram(
        "allergy",
        List("gallery", "ballerina", "regally", "clergy", "largely", "leading")
      ) shouldBe List("gallery", "regally", "largely")
    }

    it("does not detect non-anagrams with identical checksum") {
      Main.anagram("mass", List("last")) shouldBe List()
    }

    it("detects anagrams case-insensitively") {
      Main.anagram("Orchestra", List("cashregister", "Carthorse", "radishes")) shouldBe List(
        "Carthorse"
      )
    }

    it("detects anagrams using case-insensitive subject") {
      Main.anagram("Orchestra", List("cashregister", "carthorse", "radishes")) shouldBe List(
        "carthorse"
      )
    }

    it("detects anagrams using case-insensitive possible matches") {
      Main.anagram("orchestra", List("cashregister", "Carthorse", "radishes")) shouldBe List(
        "Carthorse"
      )
    }

    it("does not detect a anagram if the original word is repeated") {
      Main.anagram("go", List("go Go GO")) shouldBe List()
    }

    it("anagrams must use all letters exactly once") {
      Main.anagram("tapper", List("patter")) shouldBe List()
    }

    it("words are not anagrams of themselves (case-insensitive)") {
      Main.anagram("BANANA", List("BANANA", "Banana", "banana")) shouldBe List()
    }

  }

}
