package classes.entities

/*
    Interfaces da OO em Scala são declaradas como traits
    O diferencial do Scala para outras linguagens é que em interfaces
    métodos não abstratos podem ser declarados, ou seja, métodos
    com corpos declarados, como no trait Animal abaixo, no
    método movimentar
*/

trait Animal { // interfaces em Scala
    def barulho(): Unit // método abstrato
    def movimentar(): Unit = println("Animal se movimentando...")
}

class Gato(nome: String) extends Animal {

    override def barulho(): Unit = {
        println("Miau")
    }

    def cumprimentar(): Unit = {
        println(s"Miau, meu nome e $nome")
    }

}

def main(args: Array[String]): Unit = {
    val bichano = new Gato("Garfield")
    bichano.barulho()
    bichano.movimentar()
    bichano.cumprimentar()
}