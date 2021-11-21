package br.com.projecta.orgs.model

import java.math.BigDecimal

// data implenta o toString e outro metodos ja
data class Produto(
    val nome : String,
    val descricao : String,
    val valor : BigDecimal

)
