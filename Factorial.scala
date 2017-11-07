import scala.math.BigInt

object Factorial extends App {
    def factorialFunc(i:BigInt, accum:BigInt): BigInt = {
        if(i == 1)  return accum;
        return factorialFunc(i - 1, i * accum)
    }
    def factorial(i: BigInt):BigInt = { 
        val result = factorialFunc(i, 1);
        return result
    }
  println(factorial(10000))
}
