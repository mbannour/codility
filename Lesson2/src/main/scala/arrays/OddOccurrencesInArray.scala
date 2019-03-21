package arrays


// Correctness 100%
// Performance 100 %

//Task score 100 %
object OddOccurrencesInArray extends App {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
  
      if(a.length == 1) a.head else {
      count(a.sorted.toList, 1, a.head)
    }
  }

  def count(list: List[Int], acc: Int, value : Int): Int = list match {
    case Nil => 0
    case x :: Nil => if(x == value && (acc + 1) % 2 != 0) x else x
    case x :: xs => if(x == xs.head) count(xs, acc+ 1, x) else {
      if(acc % 2 == 0) count(xs, 1, x) else x
    }
    
}

}
