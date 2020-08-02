import scala.math.BigInt

object FactorialTailRec extends App {
  def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else factorial(i - 1, i * acc) 
  println(factorial(1000, 1))
}
