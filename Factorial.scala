import scala.math.BigInt

object Factorial extends App {
  // 末尾再帰最適化するには、再帰関数が最後でなければいけない
  // iと乗算しているので関数の後に処理があっていけないという事のよう
  // accが乗算の結果を持つ
  def factorial(i: BigInt, acc: BigInt): BigInt = if(i == 0) acc else factorial(i - 1, i * acc)

  println(factorial(10000, 1))
}
