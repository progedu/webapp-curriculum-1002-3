import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, accumulator: BigInt): BigInt = 
    if (i == 0) accumulator else factorial(i-1, i * accumulator)
  println(factorial(10000, 1))
}
