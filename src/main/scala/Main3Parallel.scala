
object Main3Parallel {

  def main(args: Array[String]) {

    val l = Range(1, 10000).map(i => s"msg${i}")

    val b = l.par.foldLeft(new ImmutableBuilder())(op)

    println(b)
  }

  def op(builder: ImmutableBuilder, msg: String): ImmutableBuilder = {
    println(Thread.currentThread().getId)
    builder.add(msg)
  }

}
