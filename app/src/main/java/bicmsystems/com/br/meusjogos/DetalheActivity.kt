package bicmsystems.com.br.meusjogos

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import bicmsystems.com.br.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_detalhe.*

class DetalheActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)
        setSupportActionBar(toolbar)

        val jogo = intent.getParcelableExtra<Jogo>("JOGO")
        supportActionBar?.title = jogo.titulo

        //ivJogoDetalhe.setImageDrawable(ContextCompat.getDrawable(this, image))
        //tvAnoLancamentoDetalhe.text = intent.getIntExtra("ANOLANCAMENTO", 0).toString()
        //tvDescricaoDetalhe.text = intent.getStringExtra("DESCRICAO")

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
