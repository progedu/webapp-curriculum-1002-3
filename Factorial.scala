import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, acc: BigInt = 1): BigInt = if (i == 0) acc else factorial(i - 1, i * acc)

  println(factorial(30000))
}
