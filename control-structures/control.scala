def myAssert(predicate: () => Boolean) = {
  if (false && !predicate)
    throw new AssertionError
}

myAssert({
  println("o, hai")
  1 == 2
})
