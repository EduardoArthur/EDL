object FlatMap {

    def main(args: Array[String]) {
        // neste exemplo quero mostrar que o uso da for comprehension passa a ser interessante quando começamos a aninhar muitas funções por possuir uma sintaxe mais simplificada
        // A lista utiliza um flatmap para transformar varias listas em uma só, possue um filtro para ver se a string possui mais de 0 caracteres (ver se possui conteudo) e por fim os elementos são mapeados para upper case
        
        val L = List("Estruturas", "", "De", "Linguagem");
        
        val R = for{
         sl <- L
         el <- sl
         if el > 0
        } yield el.toString.toUpperCase();

        println("Usando For Comprehension");
        println(R);

        println("Usando a forma 'natural' ");
        println(L.flatMap(sl => sl.filter(el => el > 0).map(el => el.toString.toUpperCase())));
    }
}