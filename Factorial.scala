import scala.math.BigInt

object Factorial extends App {
  @scala.annotation.tailrec
  def factorial(i: BigInt, n: BigInt = 1): BigInt = {
    if (i == 0) n
    else factorial(i - 1, i * n)
  }

  println(factorial(10000))
}