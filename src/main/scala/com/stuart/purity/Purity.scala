package com.stuart.purity

/**
  * our goal here is to write pure function
  * A pure function is side-effect free, plus the result does not depend on anything other than its inputs.
  * For a given input, the only effect of a pure function is the output it produces — there are no other effects.
  */
object Purity {

  /**
    FP is just programming with functions. Functions are:

      1. Total: They return an output for every input.
      2. Deterministic: They return the same output for the same input.
      3. Pure: Their only effect is computing the output.

    The rest is just composition you can learn over time.
    **/
  // lets talk about this function !
  def divide(value: Int, divider: Int): Double = value / divider

  /**
    * write a pure function for division
    */
  def divideSafe(value: Int, divider: Int) =
    ???

}
