import scala.annotation.tailrec

// reverse a list
class Problem5 {
  def reverse[T](list: List[T]): List[T] = {
    val rev: List[T] = List()

    @tailrec
    def loop(rev: List[T], list: List[T]): List[T] = {
      list match {
        case List() => rev
        case h :: tail => loop(h :: rev, tail)
      }
    }

    loop(rev, list)
  }
}
