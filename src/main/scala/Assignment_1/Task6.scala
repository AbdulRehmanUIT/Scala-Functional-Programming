package Assignment_1

object Task6 {
  def main(args: Array[String]): Unit = {
    def buildMap[A, B](data: Seq[A], f: A => B): Map[A, B] = {
      data.map(a => a -> f(a)).toMap
    }

    val lst22 = Array(1, 2, 3, 4, 5)


    def func(x: Int): Boolean = x % 2 == 0

    val result2 = buildMap(lst22, func)
    println(result2)

  }
}
