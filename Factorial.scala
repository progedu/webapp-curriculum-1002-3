import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, ret: BigInt): BigInt = if (i == 0) ret else factorial(i-1, ret * i)

  println(factorial(100000, 1))
}
