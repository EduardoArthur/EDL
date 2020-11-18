object CarroExemplo {
    // https://blog.softwaremill.com/code-for-comprehension-3cfb60236a83
    // supomos a classe carro composta por roda, corpo e motor
    
    case class Body();
    case class Wheels();
    case class Engine();
    case class Car(body:Body,engine:Engine,wheels:Wheels);
    
    private def body(): Option[Body] = Some(new Body())

    private def wheels(): Option[Wheels] = Some(new Wheels())

    private def engine(): Option[Engine] = Some(new Engine())
    
    def main(args: Array[String]) {
    
        // a for comprehension nesse caso poderia facilmente gerar carros automaticamente com o corpo, motor e rodas disponiveis
        var car = for {
        engine <- engine()
        wheels <- wheels()
        body <- body()
        } yield Car(body, engine, wheels)
        
        println(car)
    }

}