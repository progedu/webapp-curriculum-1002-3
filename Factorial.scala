import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, factRslt: BigInt): BigInt = if (i == 0) factRslt else factorial(i - 1, i * factRslt)

  println(factorial(30000, 1))
}
