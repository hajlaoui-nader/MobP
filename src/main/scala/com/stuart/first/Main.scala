package com.stuart.first

import scala.collection.convert.Wrappers.MutableBufferWrapper
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.math.BigInt

// this is a main class, it may be the project entry point
// what we need to memorize here is the second part of the object declaration (extends App)
object Main extends App {

  // variables assignment
  // what is val ?
  val message = ???
  // what is var ?
  var message2 = ???

  // scala common types ?? int, char, bool, float, double, long, string, list, map...

  // factorial(x) = x * x-1 * x-2 * ... * (fact(0) == 1)
  def factorial(x: BigInt): BigInt = if (x > 1) x * factorial(x - 1) else 1

  //Question:
  // Write a program which repeatedly prompts the user for an integer.
  // If the integer is even, print the integer.
  // If the integer is odd, print shame on you.
  // Exit the program if the user enters the integer 33.
  def myMethod() = ???

  /**
    * Given a word and a list of possible anagrams, select the correct sublist.
    *
    * Given "listen" and a list of candidates like "enlists" "google" "inlets" "banana"
    * the program should return a list containing "inlets".
    */
  def anagram(input: String, candidates: List[String]): List[String] = {
    candidates
      .filter(cand => cand.toLowerCase().sorted == input.toLowerCase().sorted)

    /*val list_input: List[Char] = input.toLowerCase().toCharArray.toList.sorted
    var list_correct_candidate = new ListBuffer[String]()
    for (cand <- candidates)
      if (cand.toLowerCase().toCharArray.toList.sorted == list_input)
        list_correct_candidate += cand
    list_correct_candidate.toList*/
  }

  /**
    * Given a phrase, count the occurrences of each word in that phrase.
    *
    * For example for the input "olly olly in come free"
    *
    * olly: 2
    * in: 1
    * come: 1
    * free: 1
    */
  def wc(phrase: String): Map[String, Int] = {
    phrase
      .split(" ")
      .groupBy(x => x)
      .mapValues(_.length)
    /*val strings: Array[String] = phrase.split(' ')
    var dict: Map[String, Int] = Map()
    for (word <- strings)
      dict = dict.updated(
        word,
        strings
          .count(thisword => word == thisword)
      )
    dict*/
  }

  /**
    * write a function to double the value of each element
    */
  def doubleMe(myList: List[Int]): List[Int] = {
    myList.map(x => x * 2)
  }

}

/**
  * Class design
  * Q: Design classes which represents a rectangle, Circle and Square and provides calculateArea method.
  */
