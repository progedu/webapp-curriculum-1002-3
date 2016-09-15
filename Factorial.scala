import scala.math.BigInt

object Factorial extends App {
  def factorial(acc: BigInt, i: BigInt): BigInt = if (i == 0) acc else factorial(acc * i, i - 1)

  println(factorial(1, 10000))
}
