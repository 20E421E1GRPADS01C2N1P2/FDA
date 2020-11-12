package br.pro.aguiar.fdan1.ui.config

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.ui.dashboard.DashboardViewModel
import br.pro.aguiar.fdan1.ui.dashboard.DashboardViewModelFactory
import kotlinx.android.synthetic.main.fragment_config.*

class ConfigFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var dashboardViewModelFactory: DashboardViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_config, container, false)

        dashboardViewModelFactory = DashboardViewModelFactory()
        var viewModelProvider = ViewModelProvider(requireActivity(), dashboardViewModelFactory)
        dashboardViewModel = viewModelProvider.get(DashboardViewModel::class.java)

        dashboardViewModel
            .valorTotal
            .observe(viewLifecycleOwner) {
                textViewPagamentoValorTotal.text = it.toString()
            }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}