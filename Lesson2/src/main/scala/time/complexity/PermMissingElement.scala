package time.complexity

//80 %

//Correctness 100 %
//Performance 60 %

 object PermMissingElement {
  def solution(a: Array[Int]): Int = {
    def getMissValue(l: List[Int]): Int = l match {
      case Nil => 1
      case x :: xs =>
        xs.headOption.fold(x + 1) { h =>
          if (h - x == 1) getMissValue(xs)
          else
            h - 1
        }
    }
    val sortedArray = a.sorted

    sortedArray.headOption.fold(1) { x =>
      if (x == 2) 1
      else
        getMissValue(sortedArray.toList)
    }
  }
}
