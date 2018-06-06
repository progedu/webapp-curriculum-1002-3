import scala.math.BigInt

object Factorial extends App {
    def factorial(i: BigInt, t: BigInt): BigInt = if (i == 0) t else factorial(i - 1, i * t)
    
    println(factorial(10000, 1))
}
