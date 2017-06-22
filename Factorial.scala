import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, ruiseki: BigInt = 1): BigInt = if (i == 0) ruiseki else factorial(i - 1, i * ruiseki)

  println(factorial(10000))
}