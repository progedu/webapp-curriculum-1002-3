import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = {

    def FactorialTailCall(n: BigInt, j: BigInt): BigInt = {
      if (n == 0) {
        j
      } else {
        FactorialTailCall(n - 1, n * j)
      }
    }

    FactorialTailCall(i, 1)
  } 

  println(factorial(30000))
}
