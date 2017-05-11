import scala.math.BigInt

object FactorialTailRec extends App {
  
  def factorialTailCall(i: BigInt, accum: BigInt): BigInt = if (i == 0) accum else factorialTailCall(i - 1, i * accum)

  println(factorialTailCall(10000, 1))
}
