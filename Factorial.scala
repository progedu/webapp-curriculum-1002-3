import scala.math.BigInt

object FactorialTailRec extends App {
  def factorial(i: BigInt, a: BigInt): BigInt = if (i == 0) a else factorial(i - 1, a*i) 
  println(factorial(10000, 1))
}
