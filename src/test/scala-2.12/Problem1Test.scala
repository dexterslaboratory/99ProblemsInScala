import org.scalatest.Matchers

class Problem1Test extends org.scalatest.FlatSpec with Matchers {
  val problem1 = new Problem1
  val listOfIntegers: List[Int] = List(1, 2, 3)
  val listOfStrings: List[String] = List("Hello", "World")
  val emptyList: List[Int] = List()
  "last" should "give the last element of the list" in {
    problem1.last(listOfIntegers) == Some(3) should be (true)
    problem1.last(listOfStrings) == Some ("World") should be (true)
    problem1.last(emptyList) == None should be(true)
  }
}
