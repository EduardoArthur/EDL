object Exemplo {
    def main(args: Array[String]): Unit = {
      val x = for(i <- 1 to 10) yield i*i

      println(x)

    }
}