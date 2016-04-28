
object Main1 {

  def main(args: Array[String]) {

    val builder = new Builder()

    val l = List("msg1", "msg2", "msg3")

    l.foreach(builder.add)

    println(builder)
  }

}
