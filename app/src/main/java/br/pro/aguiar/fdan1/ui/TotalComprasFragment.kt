package br.pro.aguiar.fdan1.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.model.Produto
import br.pro.aguiar.fdan1.ui.dashboard.DashboardViewModel
import br.pro.aguiar.fdan1.ui.dashboard.DashboardViewModelFactory
import kotlinx.android.synthetic.main.total_compras_fragment.*

class TotalComprasFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =  inflater.inflate(R.layout.total_compras_fragment, container, false)

        //dashboardViewModel = DashboardViewModel()
        dashboardViewModel = ViewModelProvider(
                requireActivity(),
                DashboardViewModelFactory(Produto(20.00f)))
            .get(DashboardViewModel::class.java)

        dashboardViewModel
            .valorTotal
            .observe(viewLifecycleOwner) {
                textViewHeaderTotalCompraValor.text = it.toString()
            }


        return view
    }



}