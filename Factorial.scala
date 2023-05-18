import scala.math.BigInt
import scala.annotation.tailrec

object Factorial extends App {

  def factorial(i: BigInt): BigInt = {
    @tailrec
    def loop(acc: BigInt, i:BigInt): BigInt = {
      if (i == 0) {
        acc
      } else {
        loop(acc * i, i - 1)
      }
    }
    loop(1, i)
  }
  println(factorial(30000))
}
