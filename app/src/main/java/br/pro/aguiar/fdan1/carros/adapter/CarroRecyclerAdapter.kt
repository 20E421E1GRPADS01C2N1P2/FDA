package br.pro.aguiar.fdan1.carros.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.carros.model.Carro
import kotlinx.android.synthetic.main.list_carro_recycler.view.*

class CarroRecyclerAdapter(
    private val carros: List<Carro>,
    private val actionClick: (Carro) -> Unit
    ): RecyclerView.Adapter
        <CarroRecyclerAdapter.CarroViewHolder>(){

    class CarroViewHolder(view: View)
        : RecyclerView.ViewHolder(view) {
        val textViewModelo = view.textViewRecyclerCarroModelo
        val textViewMarca = view.textViewRecyclerCarroMarca
        val textViewPreco = view.textViewRecyclerCarroPreco
        val btnShow = view.btnRecyclerCarroShow
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int)
            : CarroViewHolder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.list_carro_recycler,
                parent,
                false
            )

        val carroViewHolder = CarroViewHolder(view)
        return carroViewHolder
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        val carro = carros.get(position)
        holder.textViewMarca.text = carro.marca
        holder.textViewModelo.text = carro.modelo
        holder.textViewPreco.text = carro.preco.toString()
        holder.btnShow.setOnClickListener {
            actionClick(carro)
        }
    }

    override fun getItemCount(): Int = carros.size
}