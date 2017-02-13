import scala.annotation.tailrec

//find last but one element of a list
class Problem2 {
  def lastButOne[T](list: List[T]): Option[T] = {
    @tailrec
    def loop(list: List[T]): Option[T] = {
      list match {
        case List() => None
        case a :: _ :: Nil => Some(a)
        case _ :: tail => loop(tail)
      }
    }

    loop(list)
  }
}
