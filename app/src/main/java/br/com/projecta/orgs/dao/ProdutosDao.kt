package br.com.projecta.orgs.dao

import br.com.projecta.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    companion object {
        private val listaProdutos = mutableListOf<Produto>()
    }

    fun adicionar( produto : Produto ) {
        listaProdutos.add(produto)
    }

    fun buscarTodos() : List<Produto> {

        if ( listaProdutos.size == 0 ) {
            return listOf(
                Produto(
                    nome = "Caneta bic",
                    descricao = "Caneta Bic ponta Fina",
                    valor = BigDecimal("1.98")
                ),
                Produto(
                    nome = "Caderno",
                    descricao = "Caderno de Caligrafia",
                    valor = BigDecimal("7.34")
                ),
                Produto(
                    nome = "Lapiseira",
                    descricao = "Lapiseira Faber Castel",
                    valor = BigDecimal("4.21")
                ),

                )
        }
        else {
            return listaProdutos.toList()

        }
    }

}