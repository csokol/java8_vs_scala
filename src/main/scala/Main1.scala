
import collection.JavaConverters._
//312, 279, 415, 338
//535, 585, 460

//15227


//1736

//1815, 1642, 997

object Main1 {

  def main(args: Array[String]) {

//    val l = Range(1, 100000).map(i => s"msg$i")
    val l = Range(1, 100000).map(i => s"msg$i")

//    val soma:Int = Range(1, 10000).fold(0)((x1, x2) => x1 + x2)

    val t0 = System.currentTimeMillis()
    val b = l.par.map(mapeia).reduce(op2)
//    val b = l.foldLeft(new ImmutableBuilder())(op)
    val t1 = System.currentTimeMillis()
    println(t1 - t0)

    println(b)

  }

  def op(b: ImmutableBuilder, msg: String): ImmutableBuilder = {
//    println(Thread.currentThread().getId)
    b.add(msg)
  }

  def op2(b1: ImmutableBuilder, b2: ImmutableBuilder): ImmutableBuilder = {
//    println(Thread.currentThread().getId)
    b1.addAll(b2)
  }

  def mapeia(msg:String): ImmutableBuilder = {
    val builder = new ImmutableBuilder()
    builder.add(msg)
  }

}


object vai {
  def main(args: Array[String]): Unit = {
    vai()
  }

  def vai()(implicit num: Numeric[Int]) = {
    val vazia:List[Int] = List(1,2)

    val soma:Option[Int] = vazia.reduceOption(num.plus)



    println(soma)
  }
}