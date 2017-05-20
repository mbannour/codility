package arrays


// Correctness 100%
// Performance 25 %

//Task score 66 %
object OddOccurrencesInArray extends App {

  def solution(a: Array[Int]): Int = {
    def xxx(l: List[Int]): Int = {
      l match {
        case Nil => 0
        case x :: xs =>
          if (isCountElementsOdd(x, xs))
            xxx(xs.filterNot(_ == x))
          else x
      }
    }
    xxx(a.toList)
  }

  private def isCountElementsOdd(x: Int, xs: List[Int]) = {
    xs.count(_ == x) % 2 != 0
  }
}
