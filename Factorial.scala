import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, r: BigInt): BigInt = if (i == 0) r else factorial(i - 1, r * i)

  println(factorial(10000,1))
}
