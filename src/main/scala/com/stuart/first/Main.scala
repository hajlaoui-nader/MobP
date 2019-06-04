package com.stuart.first

// this is a main class, it may be the project entry point
// what we need to memorize here is the second part of the object declaration (extends App)
object Main extends App {

  // variables assignment
  // what is val ?
  val message = ???
  // what is var ?
  var message2 = ???

  // factorial(x) = x * x-1 * x-2 * ... * (fact(0) == 1)
  def factorial(x: BigInt): BigInt = ???

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
  def anagram() = ???

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
  def wc() = ???
}
/**
  * Class design
  * Q: Design classes which represents a rectangle, Circle and Square and provides calculateArea method.
  */
