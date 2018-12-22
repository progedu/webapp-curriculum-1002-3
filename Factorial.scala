import scala.math.BigInt

object Factorial extends App {
  def factorialTailRecusion (i: BigInt, result: BigInt): BigInt = {
    if (i == 0) { 
      result 
    } else {
      factorialTailRecusion(i - 1, i * result)
    }
  }
  def factorial (i: BigInt): BigInt = factorialTailRecusion(i, 1)
  println(factorial(10000))
}