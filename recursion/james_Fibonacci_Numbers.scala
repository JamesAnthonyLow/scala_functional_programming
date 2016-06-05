import scala.io.StdIn.{ readInt }
object Solution {
    
    def fibonacci(x:Int, acc1:Int=0, acc2:Int=1):Int = x match {
        case 1 => acc1
        case 2 => acc2
        case n => fibonacci(n-1, acc2, acc1+acc2)
    }

    def main(args: Array[String]) {
         println(fibonacci(readInt()))

    }
}

