package com.github.DiegoEthion

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("2.99"), BigDecimal("33.99"), BigDecimal("25.99"),
        BigDecimal("8.99"), BigDecimal("21.99")
    )

    //for_________________________________________________________________________
    var precoTotal = BigDecimal.ZERO
    for (preco in precoDosProdutos){
        precoTotal += preco    //precoTotal = precoTotal + preco
    }
    println("O preço total é : ${precoTotal}")
    //while ______________________________________________________________________
    var contador = 0
    precoTotal = BigDecimal.ZERO
    while (contador<precoDosProdutos.size){
        precoTotal += precoDosProdutos[contador]
        contador += 1
    }
    println("O preço total é : ${precoTotal}")

    //doWhile___________________________________________
    contador = 0
    precoTotal = BigDecimal.ZERO
    do{
        precoTotal += precoDosProdutos[contador]
        contador += 1

    }while (contador<precoDosProdutos.size)
    println("O preço total é : ${precoTotal}")

}