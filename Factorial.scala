import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, accur: BigInt): BigInt = if (i == 1) accur else factorial(i - 1, accur * (i - 1))

  println(factorial(100000, 100000))
}
