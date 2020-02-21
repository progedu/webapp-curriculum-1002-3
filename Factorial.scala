import scala.math.BigInt

object Factorial extends App {
  //def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)

  // 末尾再帰最適化
  def factorialCall(i: BigInt, accum: BigInt): BigInt = if (i == 0) accum else factorialCall(i - 1, i * accum)

  def factorial(i: BigInt): BigInt = factorialCall(i, 1)

  println(factorial(10000))
}
