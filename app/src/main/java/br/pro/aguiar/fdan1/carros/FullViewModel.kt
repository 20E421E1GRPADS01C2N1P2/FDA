package br.pro.aguiar.fdan1.carros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdan1.carros.model.Carro

class FullViewModel: ViewModel() {
    private val _carro = MutableLiveData<Carro>()
    val carro: LiveData<Carro>
        get() = _carro

    fun selectCar(carro: Carro) {
        _carro.value = carro
    }
}