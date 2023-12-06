package estruturasdecontrole

// Declaração de funções

def eMaiorDeIdade(idade: Int) = {
    if idade >= 18 then "Sim"
    else "Nao"
}

/*
    Em Scala, funções são declaradas com a palavra chave def
    Quando não explícitamos o tipo de retorno do valor da função ou
    dos argumentos, o tipo é atribuído implicitamente

    Na função acima, um valor do tipo inteiro que representa a idade de alguém
    é passado para a função e, dentro dela, um if-else analisa se a pessoa
    é maior de idade

    O retorno da função é uma String, implícitamente inferida pelo tipo de retorno da função
    Que, aliás, não é obrigatório utilizar a palavra-chave return nesse caso
    Tampouco foi obrigatório o uso de chaves ({}) no if-else, por exemplo
    Pois em Scala cada bloco de código é identificado a cada nova linha 
*/

def imprimirNumerosDaLista(numeros: List[Int]) : Unit = {
    for (i <- 0 until numeros.size) {
        print(s"${numeros(i)} ")
    }

}

def main(args: Array[String]): Unit = { // o tipo Unit aqui é equivalente ao Void do Java

    val idadeMoacir = 21;
    val idadeJoao = 8;

    println(s"Moacir tem $idadeMoacir anos. ${eMaiorDeIdade(idadeMoacir)}, ele e maior de idade!");
    println(s"Joao tem $idadeJoao anos. ${eMaiorDeIdade(idade = idadeJoao )}, ele nao e maior de idade!");

    // utilizar a interpolação com ${} permite executar expressões

    // Exemplo de uso do laço for
    val numeros: List[Int] = List(1, 2, 3, 4, 5, 6, 7);
    imprimirNumerosDaLista(numeros)

    // Exemplo de uso do while
    var x: Int = 0
    while x < 10 
    do 
        print(s"$x ")
        x += 1

    // Uso do match
    val siglaPais = "JN"
    /* O match equivale ao switch case de outras linguagens de programação
    mas seu uso pode ser extendido para vários casos, inclusive
    utilizar no armazenamento de variáveis" */
    val qualEOPais = siglaPais match  {
        case "BR" => "Brasil"
        case "US" => "Estados Unidos"
        case "AR" => "Argentina"
        case "IL" => "Israel"
        case _ => "Sigla invalida ou inexistente" // equivalente ao default do switch
    }
    println(s"Qual o pais da sigla $siglaPais? Resposta: $qualEOPais")
}