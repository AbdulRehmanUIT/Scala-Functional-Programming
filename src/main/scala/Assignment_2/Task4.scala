package Assignment_2

object Task4 {
  def main(args: Array[String]): Unit = {

    //Exercise 4 : 11.2

    // An example list
    val uList = List(1, 2, 3, 4, 5)

    //using wildcards for doubling
    val uListDoubled = uList.map(_ * 2)
    println(s"List elements doubled: $uListDoubled")

    //using wildcards for selective squaring
    def f(x: Int) = if (x > 2) x * x else None

    val uListSquared = uList.filter(_ > 2).map(f)
    println(s"List elements squared selectively: $uListSquared")

    //Exercise 4 : 11.3

    val Listm2: List[Int] = List(1, 2, 3, 4)

    def g(v: Int): List[Int] = List(v - 1, v, v + 1)

    // Using map
    val uListExtendedMap = uList.map(g(_))
    println(s"Extended list using map: $uListExtendedMap")

    // Using flatMap to flatten the result
    val uListExtendedFlatMap = uList.flatMap(g(_))
    println(s"Extended list using flatMap: $uListExtendedFlatMap")

    //Exercise 4 : 11.4

    val uList22: List[Int] = List(1, 2, 3, 4, 5)

    def myf(x: Int) = if (x > 2) Some(x) else None

    // Applying map and flatMap with built-in Options class
    val uListSelectiveMap = uList22.map(myf(_))
    println(s"Selective elements of List with map: $uListSelectiveMap")

    val uListSelectiveFlatMap = uList22.flatMap(myf(_))
    println(s"Selective elements of List with flatMap: $uListSelectiveFlatMap")

    //Exercise 4 : 11.5
    //no wild card can be used

  }
}
