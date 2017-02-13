import org.scalatest.{FlatSpec, Matchers}

class Problem6Test extends FlatSpec with Matchers{
  val problem6 = new Problem6
  val palindrome: List[Int] = List(1, 2, 1)
  val nonPalindrome: List[String] = List("Hello", "World")
  //val emptyList: List[Int] = List()
  "isPalindrome" should "give true in cases where the list is a Palindrome" in {
    problem6.isPalindrome(palindrome) should be (true)
    problem6.isPalindrome(nonPalindrome) should be(false)
//    problem6.isPalindrome(emptyList) should be(true)
  }
}
