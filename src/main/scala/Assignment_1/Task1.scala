package Assignment_1

import scala.collection.mutable.ListBuffer

object Task1 {
  def main(args: Array[String]): Unit = {
    val x = List(2, 3, 4, 5)
    val nums = (1 to 10).toList
    val list4 = ListBuffer(1, 2, 5, 56) // mutable list (also called array lists)
    val list6 = List.range(1, 5)
    val list9 = 1 :: 2 :: 3 :: Nil

    println(x + "\n" + nums + "\n" + list6 + "\n" + list9 + "\n" + list4)
  }
}
