package br.pro.aguiar.fdan1

class Livro(
    var titulo: String,
    var subtitulo: String,
    var autores: String,
    var paginaAtual: Int) {
    override fun toString(): String {
        return "$titulo"
    }
}
