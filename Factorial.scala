import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, j: BigInt): BigInt = {
    var a: BigInt = i - 1;
    var b: BigInt = a * j;
    if (a == 1) 
        j
    else 
        factorial(a, b);
  }
  println(factorial(30000, 1))
}
