
import scala.math._

def f(coefficients:List[Int], powers:List[Int], x:Double):Double = {
  require(coefficients.size == powers.size)
  return List.tabulate(powers.size)( n => coefficients.apply(n) * pow(x,powers.apply(n))   ).sum;
}

// The 'Area' referred to here is the area of the circle obtained
// By rotating the point on the curve (x,f(x),0) around the X-Axis
def area(coefficients:List[Int], powers:List[Int], x:Double):Double = {
  require(coefficients.size == powers.size)
  val y = f(coefficients, powers, x);
  return Pi * pow(y, 2);
}


// integral
def summation(func:(List[Int],List[Int],Double)=>Double, b:Int, a:Int, coefficients:List[Int], powers:List[Int] ):Double = {
val dx0 : Double = 0.001;
val N : Int = ((b - a).toDouble/dx0).round.toInt;
val ns = 0 to N;
val dx : Double = (b - a).toDouble/N.toDouble;
ns.map( n =>  func(coefficients, powers, a.toDouble+n*dx) * dx  ).sum;
}

