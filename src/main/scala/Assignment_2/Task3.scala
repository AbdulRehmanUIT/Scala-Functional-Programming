package Assignment_2

import scala.math.sqrt

object Task3 {
  def main(args: Array[String]): Unit = {
    def myfun(vector: List[Int]): Double = {
      val sqr_sum = vector.map(x => x * x).sum
      val mag = sqrt(sqr_sum)

      mag
    }

    val checklist = List(1, 2, 3, 4, 5, 6)
    println(myfun(checklist))


  }
}
