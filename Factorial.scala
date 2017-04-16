import scala.math.BigInt

object Factorial extends App {
  def factorial(i: Int): BigInt = {
    def factorial(i: Int, acc: BigInt): BigInt = 
    i match {
      case 1 => acc
      case _ => factorial(i - 1, i * acc)
    }
    factorial(i , 1)
  }

  println(factorial(10000))
}
