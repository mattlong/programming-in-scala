import scala.language.implicitConversions

class Rational(n: Int, d: Int) {
  def this(n: Int) = this(n, 1)

  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  override def toString = numer + "/" + denom

  def +(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def +(i: Int) =
    new Rational(numer + i * denom, denom)

  def -(that: Rational) =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i: Int) =
    new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(
      numer * that.numer,
      denom * that.denom
    )
  def *(i: Int) =
    new Rational(numer * i, denom)

  def /(that: Rational) =
    new Rational(
      numer * that.denom,
      denom * that.numer
    )
  def /(i: Int) =
    new Rational(numer, denom * i)

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}


object Rational extends App {
  val r1 = new Rational(2, 4)
  val r2 = new Rational(2, 3)
  val r3 = new Rational(66, 42)
  println(r1 + r2)
  println(r1 - r2)
  println(r1 * r2)
  println(r1 / r2)

  implicit def intToRational(x: Int) = new Rational(x)
  println(2 + r1)
}
