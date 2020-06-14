import scala.math.BigInt

object Factorial extends App {

    def factorial(n: BigInt, acc: BigInt): BigInt = {
        if (n == 0) {
             return acc
        }
        factorial(n - 1, n * acc)
    }

    println(factorial(10000, 1))
}

/*
メモ：末尾再帰最適化の仕組み

factorial(3, 1)の時、

n = 3, acc = 1
factorial(3 - 1, 3 * 1)
↓
n = 2, acc = 3
factorial(2 - 1, 2 * 3)
↓
n = 1, acc = 6
factorial(1 - 1, 1 * 6)
↓
n = 0, acc = 6
return acc // = 6
*/
