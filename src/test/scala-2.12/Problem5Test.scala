import org.scalatest.FlatSpec
import org.scalatest.Matchers

class Problem5Test extends FlatSpec with Matchers{
  val problem5 = new Problem5
  val listOfIntegers: List[Int] = List(1, 2, 3)
  val listOfStrings: List[String] = List("Hello", "World")
  val emptyList: List[Int] = List()
  "reverse" should "reverse the list" in {
    problem5.reverse(listOfIntegers) should be(List(3,2,1))
    problem5.reverse(listOfStrings) should be(List("World","Hello"))
    problem5.reverse(emptyList) should be(List())
  }
}
