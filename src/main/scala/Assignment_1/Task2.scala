package Assignment_1

import scala.util.Random

object Task2 {
  def main(args: Array[String]): Unit = {

    def isPrime2(i: Int): Boolean = {
      if (i <= 1) false
      else if (i == 2) true
      else
        !(2 until i).exists(x => i % x == 0)
    }

    val randarr = List.fill(15)(50 + Random.nextInt(500 - 50 + 1))

    val nonprimelist = randarr.filter(isPrime2)

    val itrator = nonprimelist.iterator

    while (itrator.hasNext) {
      val data = itrator.next()
      println(data)
    }

    val sortedrandarr = randarr.sorted
    println(sortedrandarr)
    val result = sortedrandarr.zipWithIndex.map { case (element, index) => (element, index) }.toMap
    println(result)


  }
}
