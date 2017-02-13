import scala.annotation.tailrec

// length of a list
class Problem4 {
  def length[T](list: List[T]): Int = {
    @tailrec
    def loop(len: Int, list: List[T]): Int = {
      list match {
        case List() => len
        case _ :: tail => loop(len + 1, tail)
      }
    }

    loop(0, list)
  }
}
