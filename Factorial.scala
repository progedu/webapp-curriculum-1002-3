import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = {
    def loop(acc: BigInt, i: BigInt):BigInt = if (i == 0) acc else loop(acc * i, i - 1)
    loop(1, i)
  }
  println(factorial(10000))
}
