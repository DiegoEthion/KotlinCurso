package com.github.DiegoEthion

fun main() {
//_________________________________________________________________________
    //if
    val tipoDeRota = "TREM" //A_PE, CARRO, ONIBUS E TREM

    //Não é RECOMENDADO FAZER IF ENCADEADOS (MA PRATICA)

    if (tipoDeRota == "A_PE"){
        println("Traçando rota a pé")
    }else if (tipoDeRota == "CARRO"){
        println("Traçando rota de Carro")
    }else if (tipoDeRota == "ONIBUS"){
        println("Traçando rota de Onibus")
    }else{
        println("Nenhuma rota selecionada!")
    }
//_______________________________________________________________________
    when(tipoDeRota){
        "A_PE" -> {
            println("Traçando rota a pé")
        }
        "CARRO" -> {
            println("Traçando rota de CARRO")
        }
        "ONIBUS" -> {
            println("Traçando rota de ONIBUS")
        }
        "TREM" -> {
            println("Traçando rota de TREM")
        }
        else -> println("Rota não Implementada")
    }

}