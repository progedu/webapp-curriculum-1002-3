import scala.math.BigInt

object Factorial extends App {
  @scala.annotation.tailrec
  def factorial(i: BigInt, n: Int): BigInt =
    n match {
      case 0 => i
      case _ => factorial(i * n, n - 1)
    }
  println(factorial(1, 30000))
}
