package br.pro.aguiar.produtostdd.exception

object ProdutoNomeException : Throwable() {
    override val message: String?
        = "Nome do Produto tem que " +
            "conter mais do que 3 caracteres."

}
