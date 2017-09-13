import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = 
    factorialRec(i, i)
    def factorialRec(i: BigInt, n: BigInt): BigInt =  
      if (i == 0) n 
      else factorialRec(i - 1, n * i)

  println(factorial(10000))
}
