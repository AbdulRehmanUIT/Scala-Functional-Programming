package Assignment_2

import scala.math.pow

object Task1_Task2 {
  def main(args: Array[String]): Unit = {

    def myfunc(x: Int) = {
      val a = 3;
      val b = 5;
      val c = 7
      val y = a * (pow(x, 2)) + b * (x) + c
      y
    }

    val list1 = Range(-3, 4).toList
    print("main list ", list1, "\n")
    val list2 = list1.map(myfunc(_))

    println(s"list after functions applied : $list2 ")


    val listziped = list1.zip(list2)

    println(s"zipped list  : $listziped ")

    val zippedWithIndex = listziped.zipWithIndex.map { case ((x, fx), index) => (x, fx, index) }

    println(s"this is zipped final : $zippedWithIndex")

    val meanFx = zippedWithIndex.map { case (x, fx, i) => fx }
    val mean = (meanFx.sum / meanFx.length)
    val fmean = zippedWithIndex.find { case (_, fx, _) => fx == mean }

    println(fmean)


  }
}
