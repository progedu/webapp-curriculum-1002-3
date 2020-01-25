import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = {
    @scala.annotation.tailrec
    def recursive(j: BigInt, acc: BigInt): BigInt = {
      if (j == 0) {
        acc
      } else {
        recursive(j - 1, j * acc)
      }
    }

    recursive(i, 1)
  }

  println(factorial(10000))
}
