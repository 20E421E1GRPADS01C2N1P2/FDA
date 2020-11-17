package br.pro.aguiar.fdan1.ui.outros

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.model.Livro
import kotlinx.android.synthetic.main.fragment_livro_atual.*

class LivroAtualFragment : Fragment() {

    // Simulacao de Consulta
    private val livro = Livro(
        "Android com Kotlin",
        "Dominando as técnicas Avançadas",
        "João Lira",
        400
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_livro_atual,
            container,
            false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // poderia fazer a consulta pelo livro
        textViewInfoLivroTitulo.text = livro.titulo
        textViewInfoLivroSubtitulo.text = livro.subtitulo
        textViewInfoLivroAutores.text = livro.autores
        textViewInfoLivroPaginaAtual.text = livro.paginaAtual.toString()
    }

}