//Solution doesn't work yet
object Solution extends App {
  import Math.{ pow => exp }
  def fac(n:Int):Double = (1 to n).product
  def eX(n:Double,x:Int=0):Double = {
    return exp(n, x)/fac(x) + eX(n, x+1)
  }
  println(eX(4))
}
