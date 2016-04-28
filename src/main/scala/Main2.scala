
object Main2 {

  def main(args: Array[String]) {

    val b = new Builder()
    val l = List("msg1", "msg2", "msg3")

    l.par.foreach(b.add)

    println(b)
  }

  def op(builder: Builder, msg: String): Builder = {
    builder.add(msg)
    builder
  }

}
