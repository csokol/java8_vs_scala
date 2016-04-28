
object Main2 {

  def main(args: Array[String]) {

    val l = List("msg1", "msg2", "msg3")

    val b = l.foldLeft(new Builder())(op)

    println(b)
  }

  def op(builder: Builder, msg: String): Builder = {
    builder.add(msg)
    builder
  }

}
