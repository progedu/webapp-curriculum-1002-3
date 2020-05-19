import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, sum: BigInt): BigInt = if (i == 0) sum else factorial(i - 1,sum * i)

  println(factorial(10000,1))
}
