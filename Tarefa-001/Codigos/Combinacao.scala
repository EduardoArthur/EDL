object Combinacao {
    def main(args: Array[String]): Unit = {
      // o resultado da variavel comb vai ser a combinacao de todos os x com todos os y
      val comb = for {
          x <- 1 to 2
          y <- 'a' to 'd'
        } yield (x,y)
        
        println(comb)
    }
}