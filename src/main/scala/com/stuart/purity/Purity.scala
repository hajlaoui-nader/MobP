package com.stuart.purity

import scala.util.{Failure, Success, Try}

/**
 * our goal here is to write pure function
 * A pure function is side-effect free, plus the result does not depend on anything other than its inputs.
 * For a given input, the only effect of a pure function is the output it produces — there are no other effects.
 */
object Purity extends App {

  /**
   *FP is just programming with functions. Functions are:
 **
   *1. Total: They return an output for every input.
   *2. Deterministic: They return the same output for the same input.
   *3. Pure: Their only effect is computing the output.
 **
   * The rest is just composition you can learn over time.
    **/
  // lets talk about this function !
  def divide(value: Int, divider: Int): Option[Double] =
    if (divider == 0) {
      None
    } else {
      Some(value / divider)
    }

  /**
   * write a pure function for division 🙌
   */
  def divideSafe(value: Int, divider: Int): Either[String, Double] =
    Try { value / divider } match {
      case Success(result)    => Right(result)
      case Failure(exception) => Left("Fck You")
    }

  def divideAndMultiplyBy2(value: Int, divider: Int): Either[String, Double] =
    divideSafe(value, divider).map(x => x * 2)

//    match {
//      case Left(error) => Left(error)
//      case Right(res)  => Right(res * 2)
//    }

  def first(): Option[Int] =
    Some(5)

  def second(): Option[Int] =
    Some(2)

  def playWithOptions(): Option[Int] = {
    val a = first()
    val b = second()
//    (a, b) match {
//      case (Some(x1), Some(x2)) => Some(x1 + x2)
//      case (None, Some(x2))     => Some(x2)
//      case (Some(x1), None)     => Some(x1)
//      case (None, None)         => None
//    }
//    a.map{
//      a_val => Some(a_val)
//    }
    for {
      x1 <- a
      x2 <- b
      _ = println("hey im here")
      _ <- Some(0)
      _ <- Some(2)
      _ = println("im still here")
      _ <- None
      _ = println("after the none hahahhahha ")
    } yield x1 + x2

  }

  /**
   * working with legacy 🤔
   */
  def callLegacy() = {
    val x = Legacy.aLegacyMethod(0)
  }

  println(s"the result of playing with Options ${playWithOptions()}")

}
