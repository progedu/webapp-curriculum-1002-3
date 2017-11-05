import scala.math.BigInt
import scala.annotation.tailrec

object Factorial extends App {
  @tailrec
  def factorial(i: BigInt, total: BigInt = 1): BigInt = if (i == 0) total else factorial(i - 1, i * total)

  println(factorial(10000))
}
