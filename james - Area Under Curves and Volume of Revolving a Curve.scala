object Solution extends App {
  def f(coefficients:List[Int],powers:List[Int],x:Double):Double = {
    require(coefficients.size == powers.size)
    ((coefficients, powers).zipped map(_ * Math.pow(x, _))).sum
  }

  def area(coefficients:List[Int],powers:List[Int],x:Double):Double = {
    require(coefficients.size == powers.size)
    scala.math.Pi * Math.pow(f(coefficients,powers,x), 2)
  }

  def summation(func:(List[Int],List[Int],Double)=>Double,
    b:Int,a:Int,coefficients:List[Int],powers:List[Int]):Double = {
      (0 to ((b - a)/0.001).toInt).map(n => func(coefficients, powers, a + n * 0.001) * 0.001).sum
  }
}
