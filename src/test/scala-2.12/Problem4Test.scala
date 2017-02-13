import org.scalatest.{FlatSpec, Matchers}

class Problem4Test extends FlatSpec with Matchers {
  val problem4 = new Problem4
  val listOfIntegers: List[Int] = List(1, 2, 3)
  val listOfStrings: List[String] = List("Hello", "World")
  val emptyList: List[Int] = List()
  "length" should "give the length of the list" in {
    problem4.length(listOfIntegers) should be(3)
    problem4.length(listOfStrings) should be(2)
    problem4.length(emptyList) should be(0)
  }
}
