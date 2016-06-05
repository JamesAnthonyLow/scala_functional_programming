import scala.io.StdIn.{readLine => gets, readInt => geti}
import scala.collection.mutable.{HashMap => Hash}
object Solution {
  def isFunction(pairs:List[Array[Int]]):Boolean = {
    val buf = Hash.empty[Int,Int]
    pairs.foreach { arr =>
      val x = arr(0)
      val y = arr(1)
      if(buf.contains(x) && buf(x) != y)
        return false
      buf += (x -> y)
    }
    true
  }
  def main(args: Array[String]) {
    for(i <- 1.to(geti)){
      val pass = isFunction(List.fill(geti)(gets.split(" ").map(_.toInt)))
      if (pass) println("YES") else println("NO")
    }
  }
}
