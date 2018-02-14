import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, acc: BigInt): BigInt = {
  //println(s"i=${i}acc=${acc}")
  if (i == 0) acc 
  else factorial(i - 1, i * acc)
  }
  println(factorial(10000,1))
}
