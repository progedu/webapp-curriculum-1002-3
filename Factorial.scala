import scala.math.BigInt

object Factorial extends App {
//   def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)
    def factorial(i: BigInt, a: BigInt): BigInt = if (i == 0) a else factorial(i - 1, i * a)

  println(factorial(30000, 1))
}
