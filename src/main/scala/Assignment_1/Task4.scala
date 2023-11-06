package Assignment_1

import scala.util.Random

object Task4 {
  def main(args: Array[String]): Unit = {

    def array_sum(arr1: Array[Double], arr2: Array[Double]): Array[Double] = {
      val result = new Array[Double](arr1.length)
      for (i <- arr1.indices) {
        result(i) = arr1(i) + arr2(i)
      }
      result
    }

    val arr22 = Array.fill(5)(Random.nextInt(10) * Random.nextDouble())
    val arr11 = Array.fill(5)(Random.nextInt(10) * Random.nextDouble())
    println("array 1 : ")
    arr11.foreach(println)
    println("array 2 : ")
    arr22.foreach(println)

    val p = array_sum(arr11, arr22)
    println("summ array : ")
    p.foreach(println)


  }
}
