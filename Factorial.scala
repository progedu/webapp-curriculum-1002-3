import scala.math.BigInt

object Factorial extends App {
  // def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)

  // def factorial(n: Int): BigInt = {
  //   def factorial(n: Int, f: BigInt): BigInt =
  //     n match {
  //       case 0 => f
  //       case _ => factorial(n - 1, n * f)
  //     }
  //     factorial(n, 1)
  // }
  // println(factorial(10000))

  def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else factorial(i - 1, i * acc)
  println(factorial(10000, 1))
}
