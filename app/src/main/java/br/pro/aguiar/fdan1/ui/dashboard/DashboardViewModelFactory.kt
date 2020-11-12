package br.pro.aguiar.fdan1.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.model.Produto
import br.pro.aguiar.fdan1.ui.profile.ProfileViewModel
import java.lang.IllegalArgumentException

class DashboardViewModelFactory(var produto: Produto? = null) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DashboardViewModel::class.java))
            return DashboardViewModel(produto) as T
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java))
            return ProfileViewModel() as T
        throw IllegalArgumentException("Classe ViewModel dever ser DashboardViewModel")
    }

}