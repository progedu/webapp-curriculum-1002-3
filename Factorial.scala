import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, accu: BigInt): BigInt = if (i == 0) accu else i * factorial(i - 1, i * accu)

  println(factorial(10000, 1))
}
