import scala.io.StdIn.readInt
object Solution {
  def fac(x:Int):Int = if (x > 0) (1 to x).reduce(_*_) else 1
  def print_row(n:Int, r:Int=0):Unit = {
    print(s"${fac(n)/(fac(r)*fac(n-r))} ")
    if(n==r) { print("\n"); return }
    print_row(n,r+1)
  }
  def pascal_triangle(k:Int,n:Int=0):Unit = {
    if(k==n) return
    print_row(n)
    pascal_triangle(k,n+1)
  }
  def main(args: Array[String]) {
    pascal_triangle(readInt)
  }
}
