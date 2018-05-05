import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, accum: BigInt): BigInt = if (i == 0) accum else factorial(i - 1, i * accum)

  println(factorial(10000, 1))
}
