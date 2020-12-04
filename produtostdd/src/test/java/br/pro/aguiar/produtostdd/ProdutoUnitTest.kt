package br.pro.aguiar.produtostdd

import br.pro.aguiar.produtostdd.exception.ProdutoMarcaException
import br.pro.aguiar.produtostdd.exception.ProdutoNomeException
import br.pro.aguiar.produtostdd.model.Produto
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ProdutoUnitTest {
    @Test fun verificar_se_objeto_eh_instanciado(){
        val produto = Produto(
            "Lapis", "Pentel", 15.00
        )
        assertTrue(produto is Produto)
    }
    @Test fun verificar_se_valor_aceita_centavos(){
        val produto = Produto(
            "Caneta", "Faber", 15.65
        )
        assertEquals(15.65, produto.valor, 0.0)
    }
    @Test fun verificar_se_valor_eh_maior_que_zero(){
        val produto = Produto(
            "Lapis", "Pentel", -18.98
        )
        assertEquals(18.98, produto.valor, 0.0)
    }
    @Test fun verificar_se_nome_tem_mais_que_tres_caracteres(){
        try {
            val produto = Produto("Pen", "Pentel", -24.09)
            assertTrue(false)
        } catch (e: Throwable) {
            assertEquals(ProdutoNomeException.message, e.message)
        }
    }
    @Test fun verificar_se_marca_tem_mais_que_tres_caracteres(){
        try {
            val produto = Produto("Caneta", "Bic", 84.54)
            assertTrue(false)
        } catch (e: Throwable) {
            assertEquals(ProdutoMarcaException.message, e.message)
        }
    }
}