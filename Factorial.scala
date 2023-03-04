import scala.math.BigInt

object FactorialTailRec extends App {
  def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else factorial(i - 1, acc * i)
  println(factorial(30000, 1))
}
