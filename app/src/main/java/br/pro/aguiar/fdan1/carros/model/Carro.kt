package br.pro.aguiar.fdan1.carros.model

class Carro (
    var marca: String, var modelo: String,
    var placa: String, var preco: Float
){
    override fun toString(): String {
        return "$marca: $modelo\t$preco"
    }
}