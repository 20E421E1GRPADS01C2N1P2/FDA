package br.pro.aguiar.fdan1.carros.ui.carro.create

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdan1.carros.database.AppDatabase
import br.pro.aguiar.fdan1.carros.model.Carro

class CreateCarroViewModel : ViewModel() {

    private val _status = MutableLiveData<Boolean>()
    val status: LiveData<Boolean>
        get() = _status

    private val _msg = MutableLiveData<String>()
    val msg: LiveData<String>
        get() = _msg

    init {
        _status.value = false
        _msg.value = null
    }

    fun store(
        marca: String, modelo: String,
        placa: String, preco: String) {
        _msg.value = "Efetuando persistência dos dados."
        val carro = Carro(marca, modelo, placa, preco.toFloat())
        AppDatabase.getInstance().store(carro)

        //if (true)
            _msg.value = "Dados cadastrados com sucesso."
            _status.value = true
        // else

    }
}