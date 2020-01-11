import scala.math.BigInt

object Factorial extends App {
  @scala.annotation.tailrec
  def factorial(i: BigInt, product: BigInt): BigInt = if (i == 0) product else factorial(i - 1, product * i) 
  println(factorial(1000, 1))
}
