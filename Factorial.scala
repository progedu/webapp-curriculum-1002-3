import scala.math.BigInt
//末尾再帰最適化  acc  アキュムレーター
object FactorialTailRec extends App {
  def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else factorial(i - 1, i * acc) 
  println(factorial(10000, 1))
}