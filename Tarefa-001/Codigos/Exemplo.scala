object Exemplo {
    def main(args: Array[String]): Unit = {

      // exemplo para mostrar o basico de como a for comprehension funciona
      // para o i de 1 ate 10 ele vai mapear na lista i*i
      val x = for(i <- 1 to 10) yield i*i

      println(x)

    }
}