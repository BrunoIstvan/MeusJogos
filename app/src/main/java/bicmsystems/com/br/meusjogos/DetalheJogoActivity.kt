package bicmsystems.com.br.meusjogos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_detalhe_jogo.*

class DetalheJogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_jogo)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tvTituloDetalhe.text = intent.getStringExtra("TITULO")
        val image = intent.getIntExtra("RESOURCEID", 0)
        ivJogoDetalhe.setImageDrawable(ContextCompat.getDrawable(this, image))
        tvAnoLancamentoDetalhe.text = intent.getIntExtra("ANOLANCAMENTO", 0).toString()
        tvDescricaoDetalhe.text = intent.getStringExtra("DESCRICAO")

    }
}
