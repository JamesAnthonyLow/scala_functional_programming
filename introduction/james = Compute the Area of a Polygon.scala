import scala.io.StdIn.{readLine, readInt}
import Math.{abs, sqrt, pow}
object Solution {
    def x(pair:Array[Int]):Int = pair(0)
    def y(pair:Array[Int]):Int = pair(1)
    def area(p:List[Array[Int]]):Double = {
        val l = p.length-1
        val n = (for(i <- 0 to l) yield x(p(i)) * y(p(if(i==l) 0 else i+1))).sum
        val m = (for(i <- 0 to l) yield y(p(i)) * x(p(if(i==l) 0 else i+1))).sum
        (n - m)/2.0
    }
    def main(args: Array[String]) {
        println(area(List.fill(readInt)(readLine.split(" ").map(_.toInt))))
    }
}
