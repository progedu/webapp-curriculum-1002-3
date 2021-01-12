import scala.math.BigInt
object Factorial extends App {
    // def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)
    // アキュムレーターと呼ばれる引数を利用した末尾再帰最適化
def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else factorial(i - 1, i * acc)


println(factorial(10000, 1))
}
