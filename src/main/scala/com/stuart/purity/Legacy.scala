package com.stuart.purity

object Legacy {

  def aLegacyMethod(x: Int): Int =
    if (x < 0) throw new IllegalArgumentException
    else x * 5

}
