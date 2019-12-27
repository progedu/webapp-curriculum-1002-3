import scala.math.BigInt

object factorialTailCall extends App{
    def factorialTailCall(i:BigInt,j:BigInt):BigInt = if(i==0)return j else factorialTailCall(i-1,i*j)

    println(factorialTailCall(10000,1))

}