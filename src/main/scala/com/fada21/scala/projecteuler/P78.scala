package com.fada21.scala.projecteuler

import scala.annotation.tailrec

/**
  * https://projecteuler.net/problem=78
  */
object P78 extends App {
  println("Problem 78!")

  def naivePileDivisions(pileSize: Int): BigInt = {

    def pileDivisions(pileSize: Int, groupLimit: Int): BigInt = {
      if (pileSize < 2) 1
      else if (groupLimit < 2) 1
      else {
        val diff: Int = pileSize - groupLimit
        if (diff < 0) pileDivisions(pileSize, groupLimit - 1)
        else pileDivisions(diff, groupLimit) + pileDivisions(pileSize, groupLimit - 1)
      }
    }

    if (pileSize < 1) 0
    else pileDivisions(pileSize, pileSize)
  }

  assert(naivePileDivisions(-1) == 0)
  assert(naivePileDivisions(0) == 0)
  assert(naivePileDivisions(1) == 1)
  assert(naivePileDivisions(2) == 2)
  assert(naivePileDivisions(3) == 3)
  assert(naivePileDivisions(4) == 5)
  assert(naivePileDivisions(5) == 7)
  assert(naivePileDivisions(6) == 11)
  assert(naivePileDivisions(7) == 15)
  assert(naivePileDivisions(8) == 22)

  def findDivisibleBy(pilePartitioningFun: Int => BigInt, divisibleBy: Int) = {
    @tailrec
    def checkIfDivisibleFrom(n: Int): Int = {
      if (pilePartitioningFun(n) % divisibleBy == 0) n
      else checkIfDivisibleFrom(n + 1)
    }
    checkIfDivisibleFrom(1)
  }

  val divisibleBy = 7
  val minN = findDivisibleBy(naivePileDivisions, divisibleBy)
  val pn = naivePileDivisions(minN)

  println(s"minimal piles divisions divisible by $divisibleBy is for pile size of $minN that has $pn different divisions")


  def findPartitionsDivisibleBy(div: Int): Int = {

    // http://problematicsets.com/project-euler-78-notes/
    // http://math.blogoverflow.com/2014/08/25/playing-with-partitions-eulers-pentagonal-theorem/
    def findPartitions(divisions: List[BigInt]): Int = ???

    def generalisedPentagonal(n: Int): Int = {
      // 0, 1, -1, 2, -2
      if (n < 0) 0
      else if (n % 2 == 0) pentagonal(n / 2 + 1)
      else pentagonal(-(n / 2 + 1))
    }

    def pentagonal(n: Int): Int = n * (3 * n - 1) / 2

    findPartitions(List(1, 1))
  }

  val divisibleBy2 = 4
  val minN2 = findPartitionsDivisibleBy(divisibleBy2)
  val pn2 = naivePileDivisions(minN2)

  println(s"minimal piles divisions divisible by $divisibleBy2 is for pile size of $minN2 that has $pn2 different divisions")

}

/**
  * pileDivisions scheme for 8 objects
  * XXXXXXXX
  * XXXXXXX X
  * XXXXXX XX
  * XXXXXX X X
  * XXXXX XXX
  * XXXXX XX X
  * XXXXX X X X
  * XXXX XXXX
  * XXXX XXX X
  * XXXX XX XX
  * XXXX XX X X
  * XXXX X X X X
  * XXX XXX XX
  * XXX XXX X X
  * XXX XX XX X
  * XXX XX X X X
  * XXX X X X X X
  * XX XX XX XX
  * XX XX XX X X
  * XX XX X X X X
  * XX X X X X X X
  * X X X X X X X X
  */

