package bicmsystems.com.br.meusjogos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import bicmsystems.com.br.meusjogos.adapter.JogoAdapter
import bicmsystems.com.br.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)
        rvMeusJogos.adapter = JogoAdapter(this, jogos(), { jogo ->
            Toast.makeText(this, "Jogo clicado: ${jogo.titulo}", Toast.LENGTH_LONG).show()
        })
        val layoutManager = LinearLayoutManager(this)
        rvMeusJogos.layoutManager = layoutManager
    }

    private fun jogos(): List<Jogo> {

        return listOf(

                Jogo(R.drawable.god_of_war,
                        "God of War",
                        2018,
                        "God of War é um jogo eletrônico."),
                Jogo(R.drawable.call_of_duty_3,
                        "Call of Duty 3",
                        2007,
                        "Nota 8"),
                Jogo(R.drawable.call_of_duty_5,
                        "Call of Duty 5",
                        2010,
                        "Jogo Nota 9"),
                Jogo(R.drawable.call_of_duty_modern_warfare,
                        "Call of Duty - Modern Warfare",
                        2012,
                        "Jogo Nota 10"),
                Jogo(R.drawable.call_of_duty_infinite_warfare,
                        "Call of Duty - Infinite Warfare",
                        2016,
                        "Jogo Nota 7"),
                Jogo(R.drawable.uncharted_drakes_fortune,
                        "Uncharted - Drakes Fortune",
                        2009,
                        "Jogo Nota 9"),
                Jogo(R.drawable.uncharted_2,
                        "Uncharted 2 - Among Thieves",
                        2012,
                        "Jogo Nota 9"),
                Jogo(R.drawable.uncharted_3,
                        "Uncharted 3 - Drake's Deception",
                        2014,
                        "Jogo Nota 10")

        )

    }

}
