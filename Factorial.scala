import scala.math.BigInt

object Factorial extends App {
  // def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)
  def factorial(i: BigInt, j: BigInt): BigInt = if (i == 0) j else factorial(i - 1, j * i)

  println(factorial(10000))
}
