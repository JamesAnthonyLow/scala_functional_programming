import scala.io.StdIn.{readLine => gets, readInt => geti}
import Math.{abs, sqrt}
object Solution {
    def sq(n:Int):Double = Math.pow(n, 2)
    def x(p1:Array[Int],p2:Array[Int]):Int = abs(p1(0)-p2(0))
    def y(p1:Array[Int],p2:Array[Int]):Int = abs(p1(1)-p2(1))
    def d(p1:Array[Int],p2:Array[Int]):Double = sqrt(sq(x(p1,p2)) + sq(y(p1,p2)))
    def perimeter(p:List[Array[Int]]):Double = (for(i<- 0 to p.length-1) yield
    {d(p(i), p(if(i==p.length-1) 0 else i+1))}).sum
    def main(args: Array[String]) {
        println(perimeter(List.fill(geti)(gets.split(" ").map(_.toInt))))
    }
}
