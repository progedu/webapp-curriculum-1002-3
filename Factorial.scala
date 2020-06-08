import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, save: BigInt): BigInt = if (i == 0) save else factorial(i - 1, i * save)

  println(factorial(10000, 1))
}