fun main() {
    //Sinal de Atribuição (=)
    val inteiro=1
    val helloworld = "Hello World Operadores"

//    Operadores com Strings
//      + -> Concatenar
    println("hello "+"world")
    println("outra forma de concatenar é ${"usando essa notação " + helloworld}")

//    Operadores Numericos
//            + -> Soma
//            - -> Subtração
//            / -> Divisão
//            % -> Dividir e pegar o Resto da divisão
//

    println("10+15 = ${10+15}")
    println("A divisão 10/3 é igual a ${10.0/3.0}")
    println("O Resto da divisão 10/3 utilizando a operação 10%3 é igual a: ${10%3}")

//    Operadores de comparação
//    == -> Igual
//    > -> Marior que
//    < -> Menor que

    println("1 é igual a 1:  ${1==1}")
    println("1 é igual a 2? ${1==2}")

    if (1==2){
        println("A Condição é verdadeira")
    }else{
        println("A Condição é Falsa")
    }
    //Comparação de Array
    val array1 = arrayOf(1,2,3)
    val array2 = arrayOf(1,2,3)
    println(array1==array2) //Maneira Errada de Comparar
    println(array1.contentEquals(array2)) // Maneira correta de comparar

}