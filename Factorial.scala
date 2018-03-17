import scala.math.BigInt

object Factorial extends App {
  def factorialfunc(input: BigInt, result: BigInt): BigInt = {
    if (input == 0)
    { 
      return result 
    }
    else
    {
      return factorialfunc(input - 1, input * result)
    }
  }
  def factorial(i: BigInt): BigInt = {
    return factorialfunc(i, 1)
  }
  println(factorial(10000))
}