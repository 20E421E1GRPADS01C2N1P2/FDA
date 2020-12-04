package br.pro.aguiar.produtostdd.exception

object ProdutoMarcaException : Throwable() {
    override val message: String?
        = "Marca do Produto tem que " +
            "conter mais do que 3 caracteres."

}
