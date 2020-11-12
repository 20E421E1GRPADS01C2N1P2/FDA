package br.pro.aguiar.fdan1.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdan1.model.Produto

class DashboardViewModel : ViewModel() {

    var produto = Produto(20.00f)
    var valorTotal = MutableLiveData<Float>()
    var quantidadeCarrinho = MutableLiveData<Int>()

    init {
        quantidadeCarrinho.value = 1
        atualizarValorTotal()
    }

    private fun atualizarValorTotal() {
        valorTotal.value = produto.preco * quantidadeCarrinho.value!!
    }

    fun addCarrinho() {
        quantidadeCarrinho.value =
            quantidadeCarrinho.value!!.plus(1)
        atualizarValorTotal()
    }

    fun subCarrinho() {
        quantidadeCarrinho.value =
            quantidadeCarrinho.value!!.minus(1)
        atualizarValorTotal()
    }
}