//palindrome list check
class Problem6 {
  def isPalindrome[T](list: List[T]):Boolean = {
    val listRev = list.reverse
    val boolean = list.zip(listRev).map( x => x._1 == x._2)
      .reduce( (boolOne,boolTwo) => (boolOne && boolTwo) )
    boolean
  }
}
