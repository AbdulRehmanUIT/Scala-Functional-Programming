package Assignment_2

object Task11 {
  def main(args: Array[String]): Unit = {

    def printAdditionAsString[T1, T2](input1: T1, input2: T2): Unit = {
      val str1 = input1.toString
      val str2 = input2.toString
      val result = str1 + str2
      println(result)
    }

    printAdditionAsString(5, "Hello")


  }
}
