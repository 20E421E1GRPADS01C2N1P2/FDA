package br.pro.aguiar.fdan1.carros.ui.carro.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.pro.aguiar.fdan1.carros.database.AppDatabase
import br.pro.aguiar.fdan1.carros.model.Carro

class ListCarroViewModel : ViewModel() {

    private val _carros = MutableLiveData<List<Carro>>()
    val carros: LiveData<List<Carro>>
        get() = _carros

    // True = Consulta com sucesso
    private val _status = MutableLiveData<Boolean>()
    val status: LiveData<Boolean>
        get() = _status

    private val _msg = MutableLiveData<String>()
    val msg: LiveData<String>
        get() = _msg

    init {
        _status.value = false
        _msg.value = null
        getAll()
    }

    fun getAll() {
        _msg.value = "Consultando a base de dados."
        val appDatabase = AppDatabase.getInstance()
        _carros.value = appDatabase.all()

        if (true){
            _status.value = true
            _msg.value = "Consulta realizada com sucesso!"
        }
    }
}