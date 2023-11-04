import scala.{::, util}
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.util.Random
import scala.collection.immutable.Map
import scala.math.{pow, sqrt}

object Main {
  def main(args: Array[String]): Unit = {


    val x = List(2, 3, 4, 5)
    val nums = (1 to 10).toList
    val list4 = ListBuffer(1, 2, 5, 56) // mutable list (also called array lists)
    val list6 = List.range(1, 5)
    val list9 = 1 :: 2 :: 3 :: Nil

    println(x + "\n" + nums + "\n" + list6 + "\n" + list9 + "\n" + list4)


    // Task 1 :
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



    //
    // task 2 :
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




    //Task 3 :

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




    //Task 4 :

    //using higher order function
    def checkeven(array: Array[Int], f: Array[Int] => Int) = {
      f(array)
    }

    var myarr = Array.fill(100)(util.Random.nextInt(100))

    var my = checkeven(myarr, (arr: Array[Int]) =>
      arr.count(_ % 2 == 0))
    println("even numbers in my array : " + my)


    //using recursion
    def checkevenrec(array: Array[Int], Count: Int = 0, index: Int = 0): Int = {
      if (index == array.length - 1) {
        if (array(index) % 2 == 0) {
          Count + 1
        }
        else Count
      }
      else {
        val cal2 = if (array(index) % 2 == 0) Count + 1 else Count
        checkevenrec(array, cal2, index + 1)
      }
    }

    var recmy = checkevenrec(myarr)
    println("even numbers using recursion are : " + recmy)
    //


    //Task 5 :
    def buildMap[A, B](data: Seq[A], f: A => B): Map[A, B] = {
      data.map(a => a -> f(a)).toMap
    }

    val lst22 = Array(1, 2, 3, 4, 5)


    def func(x: Int): Boolean = x % 2 == 0

    val result2 = buildMap(lst22, func)
    println(result)




    //assignment 2

    //Exercise 1
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


    //Exercise 2

    val listziped = list1.zip(list2)

    println(s"zipped list  : $listziped ")

    val zippedWithIndex = listziped.zipWithIndex.map { case ((x, fx), index) => (x, fx, index) }

    println(s"this is zipped final : $zippedWithIndex")

    val meanFx = zippedWithIndex.map { case (x, fx, i) => fx }
    val mean = (meanFx.sum / meanFx.length)
    val fmean = zippedWithIndex.find { case (_, fx, _) => fx == mean }

    println(fmean)



  //ex3 :

    def myfun(vector : List[Int]) : Double = {
      val sqr_sum = vector.map(x  => x * x ).sum
      val mag = sqrt(sqr_sum)

      mag
    }
    val checklist = List(1,2,3,4,5,6)
    println(myfun(checklist))



    //Exercise 4 : 11.2

    // An example list
    val uList = List(1, 2, 3, 4, 5)

    //using wildcards for doubling
    val uListDoubled = uList.map(_ * 2)
    println(s"List elements doubled: $uListDoubled")

    //using wildcards for selective squaring
    def f(x: Int) = if (x > 2) x*x else None
    val uListSquared = uList.filter(_ > 2).map(f)
    println(s"List elements squared selectively: $uListSquared")

    //Exercise 4 : 11.3

    val Listm2 :List[Int] = List(1, 2, 3, 4)
    def g(v: Int): List[Int] = List(v - 1, v, v + 1)

    // Using map
    val uListExtendedMap = uList.map(g(_))
    println(s"Extended list using map: $uListExtendedMap")

    // Using flatMap to flatten the result
    val uListExtendedFlatMap = uList.flatMap(g(_))
    println(s"Extended list using flatMap: $uListExtendedFlatMap")

    //Exercise 4 : 11.4

    val uList22 : List[Int] = List(1, 2, 3, 4, 5)
    def myf(x: Int)= if (x > 2) Some (x) else None

    // Applying map and flatMap with built-in Options class
    val uListSelectiveMap = uList22.map(myf(_))
    println(s"Selective elements of List with map: $uListSelectiveMap")

    val uListSelectiveFlatMap = uList22.flatMap(myf(_))
    println(s"Selective elements of List with flatMap: $uListSelectiveFlatMap")

    //Exercise 4 : 11.5
    //no wild card can be used

    //EX1.2

    def apply ( a :List[Int]) = {
      val ez = a.sum
      print(ez)
    }
    apply(uList22)



    //


  }

}