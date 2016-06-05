   def factorial(n: Double): Double = { if (n <= 1) 1 else n * factorial(n - 1) }
def f(x: Float):Float=
  {    // Compute and Return the value of e^x 
    return List.range(0,10).map( n => scala.math.pow(x,n) / factorial(n)  ).sum.toFloat
  }
