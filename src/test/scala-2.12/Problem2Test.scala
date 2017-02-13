import org.scalatest.{Matchers}

class Problem2Test extends org.scalatest.FlatSpec with Matchers {
  val problem2 = new Problem2
  val listOfIntegers: List[Int] = List(1, 2, 3)
  val listOfStrings: List[String] = List("Hello", "World")
  val emptyList: List[Int] = List()
  "lastButOne" should "give the last but one element of the list" in {
    problem2.lastButOne(listOfIntegers) == Some(2) should be(true)
    problem2.lastButOne(listOfStrings) == Some("Hello") should be(true)
    problem2.lastButOne(emptyList) == None should be(true)
  }
}
