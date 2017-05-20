package time.complexity

import scala.annotation.tailrec

//66 %

//correctness 100 %
//performance 33 %

object TapeEquilibrium extends App {

  def solution(a: Array[Int]): Int = {
    @tailrec
    def getMinimalDiff(l: List[Int], sum: Int, minimalDiff: Int): Int = l match {
      case Nil => minimalDiff
      case x :: xs if xs.size > 1 =>
        val diff = Math.abs(sum + x - xs.sum)
        if (diff >= minimalDiff)
          getMinimalDiff(xs, sum + x, minimalDiff)
        else
          getMinimalDiff(xs, sum + x, diff)
      case x :: xs => getMinimalDiff(xs, sum + x, minimalDiff)
    }
    getMinimalDiff(a.toList, 0, Math.abs(a.head - a.tail.sum))
  }

}
