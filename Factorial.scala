import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = {
    def factorialTailCall(i: BigInt, accum: BigInt): BigInt = if (i == 0) accum else factorialTailCall(i - 1, i * accum)
    factorialTailCall(i, 1)
  }

  println(factorial(30000))
}
