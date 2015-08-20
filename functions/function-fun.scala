def sum(a: Int, b: Int, c: Int) = a + b + c

var a = sum(1, _:Int, 3)

def noisy(a: Int) = {
  println("noisy for " + a)
  a
}

var b = sum(noisy(1), 2, _:Int)

println(b(1) == b.apply(1))

var c = 1 to 5

c.foreach(println)

c.foreach(b)

var e = c.map(b)

println(e)

def makeIncreaser(more: Int) = (x: Int) => x + more

var inc1 = makeIncreaser(1)
var inc2 = makeIncreaser(2)
inc1(2)
inc2(2)

var z = 500

def makeWeird(more: Int) = (x: Int) => x + more + z

var weird1 = makeWeird(1)
var weird2 = makeWeird(2)

weird1(1)
weird2(1)

z = 1000

weird1(1)
weird2(1)

def printArgs(args: String*) =
  for (arg <- args)
    println(arg)

printArgs("One", "Two", "Three")
printArgs(Array("Four", "Five"): _*)

def printTime(out: java.io.PrintStream = Console.out) =
  out.println("time = " + System.currentTimeMillis())

printTime()
