object MyClass {
    
    case class Player(name: String, position: String)
        
    def main(args: Array[String]) {
        // criando lista de jogadores
        val heat = List(
            Player("Mario Chamlers", "PG"),
            Player("Dwayne Wade", "SG"),
            Player("LeBron Jame", "SF"),
            Player("Udonis Haslem", "PF"),
            Player("Chris Bosh", "C")
        )
        // separando os tipos de jogadores com for comprehensions e sem para comparar as diferentes formas de fazer
        val guards = for (player <- heat if player.position endsWith "G") yield player.name
            
        val forwards = heat
            .withFilter(_.position endsWith "F")
            .map(_.name)
        
        val centre = heat
            .withFilter(player => player.position == "C")
            .map(player => player.name)
            .head
        
        // inicializando uma tabela de pontuacao
        val scoreSheet = for (Player(name, _) <- heat) yield (name, 0)
    
        // gerando a pontuacao aleatoria
        def points = util.Random.nextInt(30)
        
        // atribuindo pontuacoes para cada jogo diferente
        val vsThunder = scoreSheet map { case (p, _) => (p, points) }
        
        val vsCeltics = scoreSheet map { s => (s._1, points) }
        
        val vsLakers = scoreSheet map { sheet => val (p, _) = sheet; (p, points) }
        
        // criando a pontuacao final e deixando ela mais legivel
        val totalScores = (vsThunder ++ vsCeltics ++ vsLakers)
                            .groupBy(_._1)
                            .mapValues(_.map(_._2).sum)
                            .toList
                            .sortBy(_._2) // sort by ASC score
                            .map { case (p, s) => p + " [" + s + "]" }
                            .mkString("\n")
            
        println(totalScores)
   }
}