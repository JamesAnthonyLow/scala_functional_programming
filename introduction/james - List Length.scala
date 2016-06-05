object Solution extends App {
  import io.Source.{ stdin => in }
  def f(arr:List[Int], num:Int=0):Int = {
    if (arr.isEmpty) num else f(arr.tail, num+1)
  }
  println(f(List(1, 2, 3)))
}
