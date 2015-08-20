import ChecksumAccumulator.calculate;


object Summer extends App {
    for (season <- List("fall", "winter", "spring"))
      println(season + ": " + ChecksumAccumulator.calculate(season))
}

//object Summer {
//  def main(args: Array[String]) {
//    for (arg <- args)
//      println(arg + ": " + ChecksumAccumulator.calculate(arg))
//  }
//}
