import scala.math.BigInt

object Factorial extends App {
  def factorial(i: Int): BigInt = {
    def factorial(i: Int, f: BigInt): BigInt = if (i == 0) f else factorial(i - 1, i * f)
    
    factorial(i, 1)  
  }
  println(factorial(1001))
}