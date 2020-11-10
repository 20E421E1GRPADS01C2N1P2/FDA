package br.pro.aguiar.fdan1.ui.dashboard

import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    var quantidadeCarrinho = 0

    fun addCarrinho() : Int {
        quantidadeCarrinho++
        return quantidadeCarrinho
    }

    fun subCarrinho() : Int {
        quantidadeCarrinho--
        return quantidadeCarrinho
    }
}