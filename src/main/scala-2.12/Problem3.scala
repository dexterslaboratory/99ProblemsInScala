import scala.annotation.tailrec

//find k-th element of a list
class Problem3 {
  def kthElement[T](k: Int, list: List[T]): Option[T] = {
    @tailrec
    def loop(x: Int, list: List[T]): Option[T] = {
      (x, list) match {
        case (_, List()) => None
        case (x, h :: tail) => if (x == k) Some(h) else loop(x + 1, tail)
      }
    }

    loop(0, list)
  }
}
