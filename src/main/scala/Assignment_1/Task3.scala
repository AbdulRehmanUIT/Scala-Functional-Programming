package Assignment_1

import scala.annotation.tailrec

object Task3 {
  def main(args: Array[String]): Unit = {

    def CharArray(start: Int): List[Char] = {
      @tailrec
      def generateAlphabetList(current: Int, acc: List[Char]): List[Char] = {
        if (current > 'z'.toInt) {
          acc.reverse
        } else {
          generateAlphabetList(current + 1, current.toChar :: acc)
        }
      }

      generateAlphabetList(start, Nil)
    }

    val a = CharArray(97)
    println(a)

  }
}
