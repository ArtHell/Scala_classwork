import scala.annotation.tailrec

class Algorithm {

  def mulTwo(numbers: Array[Int]): Array[Int] =
    numbers.map(_ * 2)

  def positives(numbers: Array[Int]): Array[Int] =
    numbers.filterNot(_ < 0)

  def unite(numbers1: Array[Int], numbers2: Array[Int]): Array[(Int, Int)] =
    numbers1 zip numbers2

  def sumAll(numbers: Array[Int]): Int =
    numbers.foldLeft(0)(_ + _)

  def mulAll(numbers: Array[Int]): Int =
    numbers.foldRight(1)(_ * _)

  def factorial(number: Int): Int = {
    @tailrec
    def fact(number: Int, acc: Int): Int = {
      if (number < 2) {
        acc
      } else {
        fact(number-1, acc*number)
      }
    }
    fact(number, 1)
  }

  def fibonacci(n: Int) : Int = {

    @tailrec
    def fib(n: Int, a1: Int, a2: Int) : Int = {
      if(n == 0) {
        a2
      } else {
        fib(n-1, a2, a1+a2)
      }
    }

    if(n <= 2) {
      n-1
    }
    else {
      fib(n - 2,0,1)
    }

  }
}
