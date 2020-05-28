import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, n: BigInt): BigInt = {
    if (i == 0) {
      n
    } else {
      factorial(i - 1, i * n)
    }
  }
  println(factorial(10000, 1))
}