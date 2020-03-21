import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, result: BigInt): BigInt = if (i == 0) result else factorial(i - 1, result * i)

  println(factorial(10000, 1))
}
