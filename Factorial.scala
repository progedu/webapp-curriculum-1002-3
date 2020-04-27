import scala.math.BigInt

object Factorial extends App {

 def factorial(i: BigInt, subFactorial: BigInt): BigInt = {
  if (i == 0)
   subFactorial
  else
   factorial(i - 1, i * subFactorial)
 }

 println(factorial(10000, 1))
}
