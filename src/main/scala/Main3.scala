
object Main3 {

  def main(args: Array[String]) {

    val l = List("msg1", "msg2", "msg3")

    val b = l.foldLeft(new ImmutableBuilder())(op)

    println(b)
  }

  def op(builder: ImmutableBuilder, msg: String): ImmutableBuilder = {
    builder.add(msg)
  }

}
