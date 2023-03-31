import scala.math.BigInt

/* 3000の階乗を求める処理 */

//以下の書き方だとスタックオーバフローが起きる
//理由：再起呼び出しの実行可能回数（=階層の深さ）には上限があるため
/* object Factorial extends App {

  //値の返却時に計算「i * factorial(i - 1)」を行っているので、メモリ領域を圧迫してしまうらしい
  def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)

  println(factorial(30000))
} */


//上記のコードを、末尾再帰最適化と言うテクニックを使うことで、スタックオーバーフローが起きないよう修正
/* 
  末尾再帰構造にする上で重要な点は、
  ●最終的に返却すべき値をどこで計算しているか
  ●どのように渡っているか

  末尾再帰最適化では、関数から返却されるのを'値'か'関数'だけにする(計算式の返却はNG、関数を含めた計算式の返却もNG)
  再帰関数などでは、呼び出し時に引数に計算式を渡して引き継いでいく → 呼び出し時の引数内で計算するのがポイント
*/
object Factorial extends App {

  //第二引数に計算式n(計算結果を兼ねる)を渡すことで、計算式nを次の再起呼び出しに引き継いでいく
  def factorial(i: BigInt, n: BigInt): BigInt = if (i == 0) n else factorial(i - 1, i * n)

  println(factorial(30000, 1))
}