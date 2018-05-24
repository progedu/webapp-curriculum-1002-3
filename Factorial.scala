import scala.math.BigInt

object Factorial extends App {
  def factorial(n: Int, f: BigInt): BigInt =
  if (n == 0) f else factorial(n - 1, n * f)
  println(factorial(10000, 1))
}
