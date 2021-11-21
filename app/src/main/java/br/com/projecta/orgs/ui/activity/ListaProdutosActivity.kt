package br.com.projecta.orgs.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.projecta.orgs.R
import br.com.projecta.orgs.dao.ProdutosDao
import br.com.projecta.orgs.ui.recyclerview.adapter.ListaDeProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutosActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_produtos)
        configuraTela()
    }

    private fun configuraTela() {

        val listaDeProdutos = findViewById<RecyclerView>(R.id.view_lista_produtos)
        listaDeProdutos.adapter = ListaDeProdutosAdapter(context = this, ProdutosDao().buscarTodos() )

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            startActivity(Intent(this, FormProdutoActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        configuraTela()
    }

}