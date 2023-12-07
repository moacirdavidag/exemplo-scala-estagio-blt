// Exemplo de uma classe com atributos públicos e privados
class Pessoa(var nome: String, private var idade: Int) {

    def saudacao(): Unit = {
        println(s"Ola, sou o $nome e tenho $idade de idade!")
    }

    def setIdade(idade: Int): Unit = {
        this.idade = idade
    }

    def getIdade(): Int = this.idade

}

def main(args: Array[String]): Unit = {
    val pessoa = new Pessoa("Moacir", 21)
    pessoa.saudacao()
    pessoa.setIdade(20)
    pessoa.saudacao()
    println(pessoa.nome)  // Dá pra acessar o atributo e modificá-lo, pois é público
    // println(pessoa.idade) // Não dá pra acessar ou modificar este atributo privado
}