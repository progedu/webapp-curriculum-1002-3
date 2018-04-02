import scala.math.BigInt

object Factorial extends App {
  //末尾呼び出し最適化
  def factorial(i: BigInt, acc : BigInt): BigInt = if (i == 0) acc else factorial(i - 1, i * acc)
  println(factorial(10000,1))
}
