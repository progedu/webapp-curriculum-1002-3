import scala.math.BigInt

object FactorialTailRecursion extends App {
  def factorial(i: BigInt, accum: BigInt): BigInt = if (i == 0) accum else factorial(i - 1, accum * i)

  println(factorial(10000, 1))
}
