import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, res: BigInt = 1): BigInt = {
    if (i == 0) {
      res;
    } else {
      factorial(i - 1, res * i);
    }
  }
  println(factorial(10000))
}
