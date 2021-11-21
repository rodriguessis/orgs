package br.com.projecta.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.projecta.orgs.R
import br.com.projecta.orgs.dao.ProdutosDao
import br.com.projecta.orgs.model.Produto
import java.math.BigDecimal

class FormProdutoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_produto)

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)

        botaoSalvar.setOnClickListener {

            val edtNome = findViewById<EditText>(R.id.nome)
            val nome = edtNome.text.toString()

            val edtDescricao = findViewById<EditText>(R.id.descricao)
            val descricao = edtDescricao.text.toString()

            val edtValor = findViewById<EditText>(R.id.valor)
            val valorTexto = edtValor.text.toString()

            val valor =
                if ( valorTexto.isBlank() ) {
                    BigDecimal.ZERO
                }
                else {
                    BigDecimal(valorTexto)
                }

            val novoProduto = Produto( nome, descricao, valor )

            ProdutosDao().adicionar(novoProduto)
            finish()
        }

    }
}