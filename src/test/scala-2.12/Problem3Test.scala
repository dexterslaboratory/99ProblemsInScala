import org.scalatest.{FlatSpec, Matchers}
//kth element of a list
class Problem3Test extends FlatSpec with Matchers {
  val problem3 = new Problem3
  val listOfIntegers: List[Int] = List(1, 2, 3)
  val listOfStrings: List[String] = List("Hello", "World")
  val emptyList: List[Int] = List()
  "kthElement" should "give the kth element of the list" in {
    problem3.kthElement(2,listOfIntegers) == Some(3) should be(true)
    problem3.kthElement(1,listOfIntegers) == Some(2) should be(true)
    problem3.kthElement(0,listOfIntegers) == Some(1) should be(true)
    problem3.kthElement(0,listOfStrings) == Some("Hello") should be(true)
    problem3.kthElement(1,emptyList) == None should be(true)
  }
}
