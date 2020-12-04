package br.pro.aguiar.produtostdd.model

import br.pro.aguiar.produtostdd.exception.ProdutoMarcaException
import br.pro.aguiar.produtostdd.exception.ProdutoNomeException
import kotlin.math.absoluteValue

class Produto(
    var nome: String,
    var marca: String,
    var valor: Double) {

    init {
        valor = valor.absoluteValue
        if (nome.length < 4)
            throw ProdutoNomeException
        if (marca.length < 4)
            throw ProdutoMarcaException
    }

}
