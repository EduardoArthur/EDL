object Combinacao {
    def main(args: Array[String]): Unit = {
      val comb = for {
          x <- 1 to 2
          y <- 'a' to 'd'
        } yield (x,y)
        
        println(comb)
    }
}