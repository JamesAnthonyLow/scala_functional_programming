object Solution {
    
   def gcd(x: Int, y: Int): Int = {
      val n = if(x > y) y else x
      val m = if(x > y) x else y
      val d = m % n
      if (d == 0) n else gcd(n, d)   
   }
  

/**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
      println(gcd(pair.head,pair.reverse.head))
  } 

    def main(args: Array[String]) {
/** The part relates to the input/output. Do not change or modify it **/
         acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

    }
}

