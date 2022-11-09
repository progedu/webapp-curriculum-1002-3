import scala.math.BigInt

object Factorial extends App {
    def factorial(n : BigInt, acc : BigInt): BigInt = {
        if(n == 0) {
            acc
        }else {
         factorial(n-1, acc * n)
        }
    }

    println(factorial(30000, 1))
}