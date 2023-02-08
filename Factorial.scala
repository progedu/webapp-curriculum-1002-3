import scala.math.BigInt

object Factorial extends App {
  def factorial(n: BigInt, accum: BigInt): BigInt = if (n == 0) accum else factorial(n - 1, n * accum)
  println(factorial(30000, 1))
}
