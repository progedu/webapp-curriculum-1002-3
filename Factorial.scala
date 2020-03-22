import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, ans:BigInt): BigInt = if (i == 0) ans else factorial(i - 1, ans = i * ans)

  println(factorial(10000,1))
}
