import entities.Gato

def main(args: Array[String]): Unit = {
  // Declaração de variáveis
  val processo : String = "Processo seletivo de estágio da BLT"; // Constante
  /* Erro de compilação: atribuição a constante */
  // processo = "BLT Estágio" 

  // Ponto e vírgula não é obrigatório 

  // Tudo em Scala é um objeto
  var nome = "Moacir David" // exemplo de inferência implícita 
  println(nome.concat(" de Almeida Gonçalves"))

  /* No exemplo acima, a variável nome, do tipo String, também
  conta com vários métodos de string, como o concat, mesmo sendo uma
  variável de tipo primitivo, pois em Scala tudo é um objeto */ 

  val PI = 3.14F;
  val raioCirculo = 3;
  // É possível utilizar classes Java dentro do código Scala :)
  val areaCirculo = PI * Math.pow(raioCirculo, 2)
  println(s"A área do círculo mede $areaCirculo") // Exemplo de interpolação

  val gato = new Gato()

}
