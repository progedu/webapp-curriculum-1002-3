import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = if (i == 0) 1 else factorialTail(i - 1,i)

  def factorialTail(i: BigInt, accum: BigInt): BigInt =
    if (i == 0) return accum else factorialTail(i - 1, accum * i)

  println(factorial(50000))
}
