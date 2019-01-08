import scala.math.BigInt

object Factorial extends App {
  def factorial(n: Int, i: BigInt): BigInt = if (n == 0) i else factorial(n - 1, i * n)

  println(factorial(10000, 1))
}
