import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = if (i == 0) return 1 else return i * factorial(i - 1)

  println(factorial(10000))
}
