package br.pro.aguiar.fdan1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
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
        var viewModelProvider = ViewModelProvider(requireActivity(), dashboardViewModelFactory)

        dashboardViewModel = viewModelProvider.get(DashboardViewModel::class.java)

        dashboardViewModel
            .quantidadeCarrinho
            .observe(
                viewLifecycleOwner, Observer {
                    textViewCarQuantidadeCompras.text =
                        it.toString()
                }
            )

        dashboardViewModel
            .valorTotal
            .observe(viewLifecycleOwner) {
                textViewCarValorTotal.text = it.toString()
            }


        btnCarrinhoAdd.setOnClickListener {
            dashboardViewModel.addCarrinho()
        }

        btnCarrinhoSub.setOnClickListener {
              dashboardViewModel.subCarrinho()
        }

    }
}