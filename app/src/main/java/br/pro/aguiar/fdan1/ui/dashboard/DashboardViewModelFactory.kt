package br.pro.aguiar.fdan1.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.ui.profile.ProfileViewModel
import java.lang.IllegalArgumentException

class DashboardViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DashboardViewModel::class.java))
            return DashboardViewModel() as T
        throw IllegalArgumentException("Classe ViewModel dever ser DashboardViewModel")
    }

}