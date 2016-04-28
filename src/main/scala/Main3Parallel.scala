
object Main3Parallel {

  def main(args: Array[String]) {

    val l = Range(1, 10000).map(i => s"msg${i}")

    val t0 = System.currentTimeMillis()
    val b = l.par.foldLeft(new ImmutableBuilder())(op)
    l.foldLeft(0)(opzuada)
    val t1 = System.currentTimeMillis()

    println(t1 - t0)

  }

  def op(builder: ImmutableBuilder, msg: String): ImmutableBuilder = {
//    println(Thread.currentThread().getId)
    builder.add(msg)
  }

  def opzuada(x:String, x2: String): String = {
    "cococ"
  }

}
