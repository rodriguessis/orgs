package br.com.projecta.orgs.dao

import br.com.projecta.orgs.model.Produto
import org.junit.Test
import org.junit.Assert.*
import java.math.BigDecimal

class ProdutosDaoTest {

    @Test
    fun deve_BuscarTresItem_QuandoInicia() {

        val dao = ProdutosDao()

        val listaDeProdutos = dao.buscarTodos()

        assertEquals( 3, listaDeProdutos.size )

    }

    @Test
    fun deve_BuscarUmItem_QuandoAdicionaUmItem() {

        val dao = ProdutosDao()
        dao.adicionar( Produto("Cerveja", "Caixa Geladinha", BigDecimal("53.2")  ))

        val listaDeProdutos = dao.buscarTodos()

        assertEquals( 1, listaDeProdutos.size )
    }

}