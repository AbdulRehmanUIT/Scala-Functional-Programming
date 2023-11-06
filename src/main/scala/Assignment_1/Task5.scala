package Assignment_1

object Task5 {
  def main(args: Array[String]): Unit = {

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
    
  }
}
