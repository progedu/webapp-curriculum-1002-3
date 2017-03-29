import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = {
    def factorial(i: BigInt, acc: BigInt): BigInt =
      if (i <= 1) acc else factorial(i - 1, i * acc)
    factorial(i, 1)
  }

  println(factorial(10000))
}
