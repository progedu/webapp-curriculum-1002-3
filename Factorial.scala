import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt,j: BigInt): BigInt = if (i == 0) j else factorial(i - 1, i * j)

  println(factorial(1000, 1))
}
