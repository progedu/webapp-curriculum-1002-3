import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) 1 else factorial(i - 1, i * acc)

  println(factorial(10000, 1))
}
