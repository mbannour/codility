package arrays

/*
 Correctness 100%

 Task score 100 %
 */

object CyclicRotation {

  def solution(a: Array[Int], k: Int): Array[Int] = {

    def getRotateList (l: List[Int], size: Int): List[Int] = {
     if(size == 0 || l.isEmpty) l else
       getRotateList(l.last :: l.take(l.size - 1), size - 1)
    }
    getRotateList(a.toList, k).toArray
  }

}
