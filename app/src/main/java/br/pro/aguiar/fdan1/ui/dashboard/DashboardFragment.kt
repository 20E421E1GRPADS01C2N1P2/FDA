package br.pro.aguiar.fdan1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_dashboard, container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var dashboardViewModelFactory = DashboardViewModelFactory()
        var viewModelProvider = ViewModelProvider(this, dashboardViewModelFactory)

        dashboardViewModel = viewModelProvider.get(DashboardViewModel::class.java)

        textViewCarrinhoCompras.text = dashboardViewModel.quantidadeCarrinho.toString()

        btnCarrinhoAdd.setOnClickListener {
            textViewCarrinhoCompras.text = dashboardViewModel.addCarrinho().toString()
        }

        btnCarrinhoSub.setOnClickListener {
            textViewCarrinhoCompras.text = dashboardViewModel.subCarrinho().toString()
        }

    }
}