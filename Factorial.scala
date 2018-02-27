import scala.math.BigInt

object Factorial extends App {
  def factorial(n: Int, i: BigInt): BigInt = n match { case 0 => i case _ => factorial(n - 1, n * i) }

  println(factorial(10000, 1))
}
