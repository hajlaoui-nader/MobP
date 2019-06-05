package com.stuart.first

import org.scalatest.{FunSuite, Matchers}

class WordCountTest extends FunSuite with Matchers {

  test("count one word") {
    Main.wc("word") should be(Map(("word", 1)))
  }

  test("count one of each word") {
    Main.wc("one of each") should be(
      Map(("one", 1), ("of", 1), ("each", 1))
    )
  }

  test("multiple occurrences of a word") {
    Main.wc("one fish two fish red fish blue fish") should be(
      Map(("blue", 1), ("two", 1), ("fish", 4), ("one", 1), ("red", 1))
    )
  }

  test("handles cramped lists") {
    Main.wc("one two three") should be(
      Map(("one", 1), ("two", 1), ("three", 1))
    )
  }
}
