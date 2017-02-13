//flatten a nested list structure
class Problem7 {
  def flatten(list: List[Any]) = {
    def loop(flatList:List[Int],list:List[Any]) = {
      list match {
        case a :: List(_) => a :: List()
      }
    }
  }
}
