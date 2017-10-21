import scala.math.BigInt

object Factorial extends App {
  def factorial(n: Int, i: BigInt): BigInt = if (n == 0) i else factorial(n - 1, n * i)

  println(factorial(10000, 1))
}
