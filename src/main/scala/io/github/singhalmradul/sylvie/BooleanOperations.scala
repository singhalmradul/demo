package io.github.singhalmradul.sylvie

object BooleanOperations:
  extension (inline a: Boolean)
    inline infix def and(b: => Boolean): Boolean = a && b
    inline infix def or(b: => Boolean): Boolean  = a || b

  inline def not(a: Boolean): Boolean = !a
