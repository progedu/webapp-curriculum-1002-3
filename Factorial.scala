import scala.math.BigInt

object Factorial extends App {
  def factorial(i: Int): BigInt = {

    def go(i: Int, acc: BigInt): BigInt = i match {
      case 0 => acc
      case _ => go(i - 1, i * acc)
    }

    go(i, 1)
  }

  println(factorial(10000))
}
