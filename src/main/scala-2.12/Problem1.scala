import scala.annotation.tailrec

//find last element of a list
class Problem1 {
  def last[T](list: List[T]): Option[T] = {
    @tailrec
    def loop(list: List[T]): Option[T] = {
      list match {
        case List() => None
        case a :: Nil => Some(a)
        case _ :: tail => loop(tail)
      }
    }

    loop(list)
  }
}
