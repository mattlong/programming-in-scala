object MultiTable extends App {
  //imperative()
  println(functional())

  def functional(): String = {
    val rows = for (i <- 1 to 10) yield {
      val cols = for (j <- 1 to 10) yield {
        val prod = (i * j).toString
        " " * (4 - prod.length) + prod
      }
      cols.mkString
    }
    rows.mkString("\n")
  }

  def imperative() {
    var i = 1
    while (i <= 10) {
      var j = 1
      while (j <= 10) {
        val prod = (i * j).toString
        var k = prod.length
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      println()
      i += 1
    }
  }
}
