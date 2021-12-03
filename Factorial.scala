import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, accumulator: Int = 1): BigInt = if (i == 0) accumulator else i * factorial(i - 1, accumulator)

  println(factorial(10000))
}