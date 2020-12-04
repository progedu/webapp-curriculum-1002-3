import scala.math.BigInt

object Factorial extends App {
  // テスト対象とする値を定数化
  val test_value_for_factorial :Int = 30000

  @scala.annotation.tailrec
  def factorial(i: BigInt, acc: BigInt = 1): BigInt =
    if (i == 0) acc
    else factorial(i - 1, i * acc)

  println(factorial(test_value_for_factorial))
}
